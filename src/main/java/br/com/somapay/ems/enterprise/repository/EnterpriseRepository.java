package br.com.somapay.ems.enterprise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.somapay.ems.enterprise.entities.Enterprise;

public interface EnterpriseRepository extends JpaRepository<Enterprise, Long>{

}
