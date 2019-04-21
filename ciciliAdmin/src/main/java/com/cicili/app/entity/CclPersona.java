package com.cicili.app.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the "ccl_personas" database table.
 * 
 */
@Entity
@Table(name="ccl_personas", schema="cicili")
@NamedQuery(name="CclPersona.findAll", query="SELECT c FROM CclPersona c")
public class CclPersona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="persona_id_sequence")
    @SequenceGenerator(name="persona_id_sequence", sequenceName="cicili.global_id_sequence", allocationSize=1)
	@Column(name="id")
	private long id;

	@Column(name="correo_electronico")
	private String correoElectronico;

	@Column(name="curp")
	private String curp;

	@Column(name="materno")
	private String materno;

	@Column(name="nacimiento")
	private Timestamp nacimiento;

	@Column(name="nombres")
	private String nombres;

	@Column(name="paterno")
	private String paterno;

	@Column(name="sexo")
	private String sexo;

	@Column(name="status")
	private BigDecimal status;

	public CclPersona() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getCurp() {
		return this.curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getMaterno() {
		return this.materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public Timestamp getNacimiento() {
		return this.nacimiento;
	}

	public void setNacimiento(Timestamp nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getPaterno() {
		return this.paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public BigDecimal getStatus() {
		return this.status;
	}

	public void setStatus(BigDecimal status) {
		this.status = status;
	}

}