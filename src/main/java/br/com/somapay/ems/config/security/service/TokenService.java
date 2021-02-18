package br.com.somapay.ems.config.security.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import br.com.somapay.ems.user.entities.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class TokenService {

	@Value("${somapay.jwt.expiration}")
	private String expiration;
	
	@Value("${somapay.jwt.secret}")
	private String secret;

	public String generate(Authentication authenticate) {
		User user = (User) authenticate.getPrincipal();
		Date expirationDate = new Date(new Date().getTime() + Long.parseLong(expiration));
		return Jwts.builder().setIssuer("Somapay")
				.setSubject(user.getUsername())
				.setIssuedAt(new Date())
				.setExpiration(expirationDate)
				.signWith(SignatureAlgorithm.HS256, secret)
				.compact();
	}

	public boolean isTokenValid(String token) {
		try {
			Jwts.parser().setSigningKey(this.secret).parseClaimsJws(token);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
	
	public String getUsername(String token) {
		Claims body = Jwts.parser().setSigningKey(this.secret).parseClaimsJws(token).getBody();
		return body.getSubject();
	}
}
