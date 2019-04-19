package com.cicili.app.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "ccl_concesionarios" database table.
 * 
 */
@Entity
@Table(name="ccl_concesionarios", schema="cicili")
@NamedQuery(name="CclConcesionario.findAll", query="SELECT c FROM CclConcesionario c")
public class CclConcesionario implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="concesionario_id_sequence")
    @SequenceGenerator(name="concesionario_id_sequence", sequenceName="cicili.global_id_sequence", allocationSize=1)
	@Column(name="id")
	private long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "status")
	private long status;
	
	
	public CclConcesionario() {
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
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


	public long getStatus() {
		return status;
	}


	public void setStatus(long status) {
		this.status = status;
	}
	
	

}