package br.com.somapay.ems.payroll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.somapay.ems.payroll.dto.PayrollDTO;
import br.com.somapay.ems.payroll.dto.PayrollResumeDTO;
import br.com.somapay.ems.payroll.service.PayrollService;

@RestController
@RequestMapping("/api/v1/somapay/payroll")
public class PayrollController {

	@Autowired
	private PayrollService service;
	
	@PostMapping
	public ResponseEntity<PayrollResumeDTO> create(@RequestBody PayrollDTO payrollDTO) {
		PayrollResumeDTO processPayment = service.processPayment(payrollDTO);
		
		return ResponseEntity.ok(processPayment);
	}
}
