package br.com.somapay.ems.user.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "user not found")
public class UserDataNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 5668130740890115712L;

}
