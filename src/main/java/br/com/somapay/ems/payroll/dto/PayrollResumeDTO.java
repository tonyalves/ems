package br.com.somapay.ems.payroll.dto;

public class PayrollResumeDTO {
	private Long enterpriseId;
	private Integer employeesPaidCount;
	private Double payrollGross;
	private Double taxApplied;
	private String message;
	
	
	public PayrollResumeDTO(String message, Long enterpriseId, Integer employeesPaidCount, Double payrollGross, Double taxApplied) {
		super();
		this.message = message;
		this.enterpriseId = enterpriseId;
		this.employeesPaidCount = employeesPaidCount;
		this.payrollGross = payrollGross;
		this.taxApplied = taxApplied;
	}
	
	public Long getEnterpriseId() {
		return enterpriseId;
	}
	public void setEnterpriseId(Long enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public Integer getEmployeesPaidCount() {
		return employeesPaidCount;
	}
	public void setEmployeesPaidCount(Integer employeesPaidCount) {
		this.employeesPaidCount = employeesPaidCount;
	}
	public Double getPayrollGross() {
		return payrollGross;
	}
	public void setPayrollGross(Double payrollGross) {
		this.payrollGross = payrollGross;
	}
	public Double getTaxApplied() {
		return taxApplied;
	}
	public void setTaxApplied(Double taxApplied) {
		this.taxApplied = taxApplied;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
