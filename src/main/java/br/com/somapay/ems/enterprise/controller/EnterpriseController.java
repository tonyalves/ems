package br.com.somapay.ems.enterprise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.somapay.ems.account.dto.BalanceDTO;
import br.com.somapay.ems.enterprise.entities.Enterprise;
import br.com.somapay.ems.enterprise.service.EnterpriseService;

@RestController
@RequestMapping("/api/v1/somapay/enterprise")
public class EnterpriseController {
	
	@Autowired
	private EnterpriseService service;
	
	@PostMapping
	public ResponseEntity<Enterprise> create(@RequestBody Enterprise enterprise) {
		try {
			Enterprise create = service.create(enterprise);
			return ResponseEntity.status(HttpStatus.CREATED).body(create);
		} catch(IllegalArgumentException e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@GetMapping("/{id}/balance")
	public ResponseEntity<BalanceDTO> getBalance(@PathVariable Long id) {
		BalanceDTO balance = service.getBalance(id);
		return ResponseEntity.ok().body(balance);
	}
	
}
