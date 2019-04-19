package com.cicili.app.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the "ccl_clientes" database table.
 * 
 */
@Entity
@Table(name="ccl_clientes", schema="cicili")
@NamedQuery(name="CclCliente.findAll", query="SELECT c FROM CclCliente c")
public class CclCliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="\"id\"")
	private long id;

	@Column(name="\"actualizado_en\"")
	private Timestamp actualizadoEn;

	@Column(name="\"actualizado_por\"")
	private String actualizadoPor;

	@Column(name="\"cliente\"")
	private long cliente;

	@Column(name="\"creado_en\"")
	private Timestamp creadoEn;

	@Column(name="\"creado_por\"")
	private String creadoPor;

	@Column(name="\"password\"")
	private String password;

	@Column(name="\"row_version\"")
	private BigDecimal rowVersion;

	@Column(name="\"status\"")
	private BigDecimal status;

	public CclCliente() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getActualizadoEn() {
		return this.actualizadoEn;
	}

	public void setActualizadoEn(Timestamp actualizadoEn) {
		this.actualizadoEn = actualizadoEn;
	}

	public String getActualizadoPor() {
		return this.actualizadoPor;
	}

	public void setActualizadoPor(String actualizadoPor) {
		this.actualizadoPor = actualizadoPor;
	}

	public long getCliente() {
		return this.cliente;
	}

	public void setCliente(long cliente) {
		this.cliente = cliente;
	}

	public Timestamp getCreadoEn() {
		return this.creadoEn;
	}

	public void setCreadoEn(Timestamp creadoEn) {
		this.creadoEn = creadoEn;
	}

	public String getCreadoPor() {
		return this.creadoPor;
	}

	public void setCreadoPor(String creadoPor) {
		this.creadoPor = creadoPor;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public BigDecimal getRowVersion() {
		return this.rowVersion;
	}

	public void setRowVersion(BigDecimal rowVersion) {
		this.rowVersion = rowVersion;
	}

	public BigDecimal getStatus() {
		return this.status;
	}

	public void setStatus(BigDecimal status) {
		this.status = status;
	}

}