package com.cicili.app.entity;

import java.io.Serializable;
import javax.persistence.*;



import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the "ccl_direcciones" database table.
 * 
 */
@Entity
@Table(name="ccl_direcciones", schema="cicili")
@NamedQuery(name="CclDireccion.findAll", query="SELECT d FROM CclDireccion d")
public class CclDireccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="direccion_id_sequence")
    @SequenceGenerator(name="direccion_id_sequence", sequenceName="cicili.global_id_sequence", allocationSize=1)
	@Column(name="id", unique=true, nullable=false)
	private long id;

	@Column(name="asentamiento")
	private long asentamiento;

	@Column(name="calle", length=100)
	private String calle;

	@Column(name="coordenadax")
	private long coordenadax;

	@Column(name="coordenaday")
	private long coordenaday;
	
	@Column(name="exterior")
	private String exterior;

	@Column(name="interior")
	private String interior;

	@Column(name="region")
	private long region;

	@Column(name="status", nullable=false, precision=38)
	private BigDecimal status;

	public CclDireccion() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAsentamiento() {
		return this.asentamiento;
	}

	public void setAsentamiento(long asentamiento) {
		this.asentamiento = asentamiento;
	}

	public String getCalle() {
		return this.calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public long getCoordenadax() {
		return this.coordenadax;
	}

	public void setCoordenadax(long coordenadax) {
		this.coordenadax = coordenadax;
	}

	public long getCoordenaday() {
		return this.coordenaday;
	}

	public void setCoordenaday(long coordenaday) {
		this.coordenaday = coordenaday;
	}

	public String getExterior() {
		return this.exterior;
	}

	public void setExterior(String exterior) {
		this.exterior = exterior;
	}

	public String getInterior() {
		return this.interior;
	}

	public void setInterior(String interior) {
		this.interior = interior;
	}

	public long getRegion() {
		return this.region;
	}

	public void setRegion(long region) {
		this.region = region;
	}

	public BigDecimal getStatus() {
		return this.status;
	}

	public void setStatus(BigDecimal status) {
		this.status = status;
	}
	
}
