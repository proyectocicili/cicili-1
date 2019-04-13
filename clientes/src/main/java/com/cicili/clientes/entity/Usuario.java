package com.cicili.clientes.entity;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class Usuario {

	@Email(message="Formato de correo no valido")
	@Size(min = 1, max = 254, message="Rango permitido de 1 a 254 caracteres")
	private String correo;

	@Size(min = 1, max = 100, message="Rango permitido de 1 a 100 caracteres")
	private String password;

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
