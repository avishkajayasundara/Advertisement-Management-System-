package com.example.demo.Principal;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.model.Agency;

public class UserPrincipal implements UserDetails {

	private Agency agency;
	
	
	
	
	public UserPrincipal(Agency agency) {
		super();
		this.agency = agency;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
	
		return Collections.singleton(new SimpleGrantedAuthority("USER"));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return agency.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return agency.getAgencyName();
	}
	
	public int getId() {
		// TODO Auto-generated method stub
		return agency.getAid();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
