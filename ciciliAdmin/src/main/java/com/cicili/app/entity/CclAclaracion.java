package com.cicili.app.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ccl_aclaraciones", schema = "cicili")
@NamedQuery(name="CclAclaracion.findAll", query="SELECT c FROM CclAclaracion c")
public class CclAclaracion implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="aclaracion_id_sequence")
    @SequenceGenerator(name="aclaracion_id_sequence", sequenceName="cicili.global_id_sequence", allocationSize=1)
	@Column(name = "id")
	private long id;
	
	@Column(name = "aclaracion")
	private String aclaracion;
	
	@Column(name = "usuario")
	private long usuario;
	
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getAclaracion() {
		return aclaracion;
	}


	public void setAclaracion(String aclaracion) {
		this.aclaracion = aclaracion;
	}


	public long getUsuario() {
		return usuario;
	}


	public void setUsuario(long usuario) {
		this.usuario = usuario;
	}
	
	
}
