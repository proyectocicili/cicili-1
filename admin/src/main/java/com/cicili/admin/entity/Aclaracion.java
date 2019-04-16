package com.cicili.admin.entity;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.validation.constraints.Size;

public class Aclaracion {
	
	private BigDecimal idAclaracion;
	
	
	@Size(min = 1, max = 3000, message="Rango permitido de 1 a 3,000 caracteres")
	private String aclaracion;


	public BigDecimal getIdAclaracion() {
		return idAclaracion;
	}


	public void setIdAclaracion(BigDecimal idAclaracion) {
		this.idAclaracion = idAclaracion;
	}


	public String getAclaracion() {
		return aclaracion;
	}


	public void setAclaracion(String aclaracion) {
		this.aclaracion = aclaracion;
	}
	
	
}
