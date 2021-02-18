package br.com.somapay.ems.payroll.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.SERVICE_UNAVAILABLE, reason = "It's not possible calculate payroll.")
public class PayrollException extends RuntimeException{

}
