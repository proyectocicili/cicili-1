package com.cicili.admin.entity;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class Concesionario {
	
	private int idConcesionario;
	
	
	@Size(min = 1, max = 254, message="Rango permitido de 1 a 254 caracteres")
	private String nombre;
	
	@Size(min = 1, max = 3000, message="Rango permitido de 1 a 3,000 caracteres")
	private String descripcion;
	
	
	public int getIdConcesionario() {
		return idConcesionario;
	}
	public void setIdConcesionario(int idConcesionario) {
		this.idConcesionario = idConcesionario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	
}
