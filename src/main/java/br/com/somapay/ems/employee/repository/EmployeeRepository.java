package br.com.somapay.ems.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.somapay.ems.employee.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
