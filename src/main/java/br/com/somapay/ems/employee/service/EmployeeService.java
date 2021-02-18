package br.com.somapay.ems.employee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.somapay.ems.account.dto.BalanceDTO;
import br.com.somapay.ems.account.entities.Account;
import br.com.somapay.ems.employee.entities.Employee;
import br.com.somapay.ems.employee.exceptions.EmployeeNotFoundException;
import br.com.somapay.ems.employee.repository.EmployeeRepository;
import br.com.somapay.ems.enterprise.entities.Enterprise;
import br.com.somapay.ems.enterprise.exceptions.EnterpriseNotFoundException;
import br.com.somapay.ems.enterprise.repository.EnterpriseRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	@Autowired
	private EnterpriseRepository enterpriseRepository;
	
	public Employee create(Employee employee, Long enterpriseId) {
		Optional<Enterprise> enterpriseOpt = enterpriseRepository.findById(enterpriseId);
		if(enterpriseOpt.isEmpty())
			throw new EnterpriseNotFoundException();
		employee.setEnterprise(enterpriseOpt.get());
		return repository.save(employee);
	}
	
	public BalanceDTO getBalance(Long id) {
		Optional<Employee> findById = repository.findById(id);
		if(findById.isEmpty())
			throw new EmployeeNotFoundException();
		Account account = findById.get().getAccount();
		if(account == null)
			return new BalanceDTO();
		BalanceDTO dto = new BalanceDTO();
		dto.setAccountNumber(account.getNumber());
		dto.setBalance(account.getBalance());
		return dto;
	}
	
}
