package br.com.somapay.ems.enterprise.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.somapay.ems.account.dto.BalanceDTO;
import br.com.somapay.ems.account.entities.Account;
import br.com.somapay.ems.enterprise.entities.Enterprise;
import br.com.somapay.ems.enterprise.exceptions.EnterpriseNotFoundException;
import br.com.somapay.ems.enterprise.repository.EnterpriseRepository;

@Service
public class EnterpriseService {

	@Autowired
	private EnterpriseRepository repository;
	
	public Enterprise create(Enterprise enterprise) {
		return repository.save(enterprise);
	}
	
	public BalanceDTO getBalance(Long id) {
		Optional<Enterprise> findById = repository.findById(id);
		if(findById.isEmpty())
			throw new EnterpriseNotFoundException();
		Account account = findById.get().getAccount();
		if(account == null)
			return new BalanceDTO();
		BalanceDTO dto = new BalanceDTO();
		dto.setAccountNumber(account.getNumber());
		dto.setBalance(account.getBalance());
		return dto;
	}
}
