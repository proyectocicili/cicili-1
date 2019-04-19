package com.cicili.app.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the "ccl_pipas" database table.
 * 
 */
@Entity
@Table(name="ccl_pipas", schema="cicili")
@NamedQuery(name="CclPipa.findAll", query="SELECT c FROM CclPipa c")
public class CclPipa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="pipa_id_sequence")
    @SequenceGenerator(name="pipa_id_sequence", sequenceName="cicili.global_id_sequence", allocationSize=1)
	@Column(name="id")
	private long id;

	@Column(name="caducidad")
	private Timestamp caducidad;

	@Column(name="clave")
	private String clave;

	@Column(name="color")
	private String color;

	@Column(name="factura")
	private String factura;

	@Column(name="fecha")
	private Timestamp fecha;

	@Column(name="marca")
	private long marca;

	@Column(name="modelo")
	private long modelo;

	@Column(name="motor")
	private String motor;

	@Column(name="municipio")
	private long municipio;

	@Column(name="serie")
	private String serie;

	@Column(name="status")
	private BigDecimal status;

	public CclPipa() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public Timestamp getCaducidad() {
		return this.caducidad;
	}

	public void setCaducidad(Timestamp caducidad) {
		this.caducidad = caducidad;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFactura() {
		return this.factura;
	}

	public void setFactura(String factura) {
		this.factura = factura;
	}

	public Timestamp getFecha() {
		return this.fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public long getMarca() {
		return this.marca;
	}

	public void setMarca(long marca) {
		this.marca = marca;
	}

	public long getModelo() {
		return this.modelo;
	}

	public void setModelo(long modelo) {
		this.modelo = modelo;
	}

	public String getMotor() {
		return this.motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public long getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(long municipio) {
		this.municipio = municipio;
	}

	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public BigDecimal getStatus() {
		return this.status;
	}

	public void setStatus(BigDecimal status) {
		this.status = status;
	}

}