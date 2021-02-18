package br.com.somapay.ems.payroll.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "one or more employee(s) not belongs to the given enterprise")
public class EmployeeNotBelongsException extends RuntimeException{

}
