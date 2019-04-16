package com.cicili.admin.entity;

public class Direccion {
	
	Long idDireccion;
	String calle;
	String interior;
	String exterior;
	String clave;
	
	Asentamiento asentamiento;
	Municipio municipio;
	Estado estado;
	Pais pais;
	
	public Long getIdDireccion() {
		return idDireccion;
	}
	public void setIdDireccion(Long idDireccion) {
		this.idDireccion = idDireccion;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getInterior() {
		return interior;
	}
	public void setInterior(String interior) {
		this.interior = interior;
	}
	public String getExterior() {
		return exterior;
	}
	public void setExterior(String exterior) {
		this.exterior = exterior;
	}
	public Asentamiento getAsentamiento() {
		return asentamiento;
	}
	public void setAsentamiento(Asentamiento asentamiento) {
		this.asentamiento = asentamiento;
	}
	public Municipio getMunicipio() {
		return municipio;
	}
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	

}
