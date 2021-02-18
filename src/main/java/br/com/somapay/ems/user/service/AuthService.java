package br.com.somapay.ems.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.somapay.ems.user.entities.User;
import br.com.somapay.ems.user.entities.repository.UserRepository;

@Service
public class AuthService implements UserDetailsService{

	@Autowired
	private UserRepository repository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> findByUsername = repository.findByUsername(username);
		if(findByUsername.isPresent()) {
			return findByUsername.get();
		}
		throw new UsernameNotFoundException("Invalid username/password");
	}

}
