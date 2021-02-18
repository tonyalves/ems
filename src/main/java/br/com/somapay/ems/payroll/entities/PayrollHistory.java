package br.com.somapay.ems.payroll.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.somapay.ems.employee.entities.Employee;
import br.com.somapay.ems.enterprise.entities.Enterprise;

@Entity
@Table(name = "payroll_history")
public class PayrollHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "payment_date")
	private LocalDateTime paymentDate; 
	
	@OneToOne
	private Enterprise enterprise;
	
	@OneToOne
	private Employee employee;
	
	private Double paymentValue;
	
	private Double tax;
	
	public PayrollHistory(LocalDateTime paymentDate, Enterprise enterprise, Employee employee, Double paymentValue,
			Double tax) {
		super();
		this.paymentDate = paymentDate;
		this.enterprise = enterprise;
		this.employee = employee;
		this.paymentValue = paymentValue;
		this.tax = tax;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Enterprise getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Double getPaymentValue() {
		return paymentValue;
	}

	public void setPaymentValue(Double paymentValue) {
		this.paymentValue = paymentValue;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
}
