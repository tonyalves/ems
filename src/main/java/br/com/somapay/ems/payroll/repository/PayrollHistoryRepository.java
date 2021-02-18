package br.com.somapay.ems.payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.somapay.ems.payroll.entities.PayrollHistory;

public interface PayrollHistoryRepository extends JpaRepository<PayrollHistory, Long>{

}
