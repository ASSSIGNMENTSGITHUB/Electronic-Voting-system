package com.project.electronicvotingsystem.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class AdminDTO {
	
	@Id
	private String email;
	
	@NotNull(message="password is mandatory")
	private String password;

	public AdminDTO(String email, @NotNull(message = "password is mandatory") String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public AdminDTO() {
		super();
	}

	@Override
	public String toString() {
		return "AdminEntity [email=" + email + ", password=" + password + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
