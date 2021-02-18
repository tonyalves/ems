package br.com.somapay.ems.payroll.dto;

import java.util.Set;

public class PayrollDTO {
	private Long enterpriseId;
	private boolean payAllEmployees;
	private Set<Long> employeesToPay;
	public Long getEnterpriseId() {
		return enterpriseId;
	}
	public void setEnterpriseId(Long enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public boolean isPayAllEmployees() {
		return payAllEmployees;
	}
	public void setPayAllEmployees(boolean payAllEmployees) {
		this.payAllEmployees = payAllEmployees;
	}
	public Set<Long> getEmployeesToPay() {
		return employeesToPay;
	}
	public void setEmployeesToPay(Set<Long> employeesToPay) {
		this.employeesToPay = employeesToPay;
	}
	
}
