package com.cicili.app.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the "ccl_choferes" database table.
 * 
 */
@Entity
@Table(name="ccl_choferes", schema="cicili")
@NamedQuery(name="CclConductor.findAll", query="SELECT c FROM CclConductor c")
public class CclConductor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="conductor_id_sequence")
    @SequenceGenerator(name="conductor_id_sequence", sequenceName="cicili.global_id_sequence", allocationSize=1)
	@Column(name="id")
	private long id;

	@Column(name="chofer")
	private long chofer;

	@Column(name="concesionario_id")
	private long concesionarioId;

	@Column(name="ine")
	private String ine;

	@Column(name="licencia")
	private String licencia;

	@Column(name="status")
	private BigDecimal status;

	public CclConductor() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getChofer() {
		return this.chofer;
	}

	public void setChofer(long chofer) {
		this.chofer = chofer;
	}

	public long getConcesionarioId() {
		return this.concesionarioId;
	}

	public void setConcesionarioId(long concesionarioId) {
		this.concesionarioId = concesionarioId;
	}

	public String getIne() {
		return this.ine;
	}

	public void setIne(String ine) {
		this.ine = ine;
	}

	public String getLicencia() {
		return this.licencia;
	}

	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	public BigDecimal getStatus() {
		return this.status;
	}

	public void setStatus(BigDecimal status) {
		this.status = status;
	}

}