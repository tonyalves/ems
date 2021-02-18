package br.com.somapay.ems.payroll.service;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.somapay.ems.account.entities.Account;
import br.com.somapay.ems.employee.entities.Employee;
import br.com.somapay.ems.employee.repository.EmployeeRepository;
import br.com.somapay.ems.enterprise.entities.Enterprise;
import br.com.somapay.ems.enterprise.exceptions.EnterpriseNotFoundException;
import br.com.somapay.ems.enterprise.repository.EnterpriseRepository;
import br.com.somapay.ems.payroll.dto.PayrollDTO;
import br.com.somapay.ems.payroll.dto.PayrollResumeDTO;
import br.com.somapay.ems.payroll.entities.PayrollHistory;
import br.com.somapay.ems.payroll.exceptions.EmployeeNotBelongsException;
import br.com.somapay.ems.payroll.exceptions.PayrollException;
import br.com.somapay.ems.payroll.repository.PayrollHistoryRepository;

@Service
public class PayrollService {
	final Double TAX = 0.38;

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private EnterpriseRepository enterpriseRepository;
	
	@Autowired
	private PayrollHistoryRepository payrollHistoryRepository;

	public PayrollResumeDTO processPayment(PayrollDTO payrollDTO) {
		Optional<Enterprise> enterpriseOpt = enterpriseRepository.findById(payrollDTO.getEnterpriseId());
		if (enterpriseOpt.isEmpty())
			throw new EnterpriseNotFoundException();

		Enterprise enterprise = enterpriseOpt.get();
		Set<Employee> employeesToPay = new HashSet<>();

		if (payrollDTO.isPayAllEmployees())
			employeesToPay = enterprise.getEmployees();
		else
			employeesToPay = new HashSet<>(employeeRepository.findAllById(payrollDTO.getEmployeesToPay()));

		if (ensureEmployeeBelongsToEnterprise(enterprise.getId(), employeesToPay)) {
			throw new EmployeeNotBelongsException();
		}

		Optional<Double> payrollTotal = employeesToPay.stream().map(e -> e.getSalary()).reduce((a, b) -> a + b);
		if(payrollTotal.isEmpty())
			throw new PayrollException();
		Double payrollWithTax = applyTax(payrollTotal.get(), TAX);
		double enterpriseBalance = enterprise.getAccount().getBalance();

		if (checkCanPay(payrollWithTax, enterpriseBalance))
			return new PayrollResumeDTO("insufficient balance", null, null, null, null);
		updateBalanceEnterprise(enterprise, payrollWithTax);
		updateBalanceEmployee(employeesToPay);
		
		setHistory(employeesToPay, enterprise);
		
		return new PayrollResumeDTO("Success", enterprise.getId(), employeesToPay.size(), payrollWithTax, payrollWithTax-payrollTotal.get());
		
	}

	private void setHistory(Set<Employee> employeesToPay, Enterprise enterprise) {
		employeesToPay.stream().forEach(e -> {
			PayrollHistory history = new PayrollHistory(LocalDateTime.now(), enterprise, e, e.getSalary(), TAX);
			payrollHistoryRepository.save(history);
		});
	}

	private boolean ensureEmployeeBelongsToEnterprise(Long enterpriseId, Set<Employee> employeesToPay) {
		long count = employeesToPay.stream().filter(e -> e.getEnterprise().getId() != enterpriseId).count();
		return count > 0;
	}

	private double applyTax(Double payrollGross, double tax) {
		return (payrollGross * (tax/100))+payrollGross;
	}

	private void updateBalanceEnterprise(Enterprise enterprise, Double payrollTotal) {
		Account account = enterprise.getAccount();

		account.setBalance(account.getBalance() - payrollTotal);
		enterpriseRepository.save(enterprise);
	}

	private void updateBalanceEmployee(Set<Employee> employees) {
		employees.stream().forEach(e -> {
			Account ac = e.getAccount();
			double salary = e.getSalary();

			ac.setBalance(ac.getBalance() + salary);
			employeeRepository.save(e);
		});

	}

	private boolean checkCanPay(Double payrollTotal, Double enterpriseBalance) {
		return payrollTotal > enterpriseBalance;
	}
}
