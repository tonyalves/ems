package br.com.somapay.ems.employee.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import br.com.somapay.ems.enterprise.entities.Enterprise;

public class EnterpriseEmployees {
	
	@EmbeddedId
	private Long enterpriseEmployeeId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("enterprise_id")
	private Enterprise enterprise;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("employees_id")
	private Employee employee;

	public EnterpriseEmployees(Enterprise enterprise, Employee employee) {
		super();
		this.enterprise = enterprise;
		this.employee = employee;
	}

	public Long getEnterpriseEmployeeId() {
		return enterpriseEmployeeId;
	}

	public void setEnterpriseEmployeeId(Long enterpriseEmployeeId) {
		this.enterpriseEmployeeId = enterpriseEmployeeId;
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
	
}
