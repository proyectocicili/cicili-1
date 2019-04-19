package com.cicili.app.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the "ccl_pedidos" database table.
 * 
 */
@Entity
@Table(name="ccl_pedidos", schema="cicili")
@NamedQuery(name="CclPedido.findAll", query="SELECT c FROM CclPedido c")
public class CclPedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="pedido_id_sequence")
    @SequenceGenerator(name="pedido_id_sequence", sequenceName="cicili.global_id_sequence", allocationSize=1)
	@Column(name="id")
	private long id;

	@Column(name="cantidad")
	private long cantidad;

	@Column(name="cliente")
	private long cliente;

	@Column(name="domicilio_venta")
	private long domicilioVenta;

	@Column(name="fecha_pedido")
	private Timestamp fechaPedido;

	@Column(name="fecha_solicitada")
	private Timestamp fechaSolicitada;

	@Column(name="hora_solicitada")
	private long horaSolicitada;

	@Column(name="monto")
	private long monto;

	@Column(name="status")
	private BigDecimal status;

	public CclPedido() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

	public long getCliente() {
		return this.cliente;
	}

	public void setCliente(long cliente) {
		this.cliente = cliente;
	}

	public long getDomicilioVenta() {
		return this.domicilioVenta;
	}

	public void setDomicilioVenta(long domicilioVenta) {
		this.domicilioVenta = domicilioVenta;
	}

	public Timestamp getFechaPedido() {
		return this.fechaPedido;
	}

	public void setFechaPedido(Timestamp fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public Timestamp getFechaSolicitada() {
		return this.fechaSolicitada;
	}

	public void setFechaSolicitada(Timestamp fechaSolicitada) {
		this.fechaSolicitada = fechaSolicitada;
	}

	public long getHoraSolicitada() {
		return this.horaSolicitada;
	}

	public void setHoraSolicitada(long horaSolicitada) {
		this.horaSolicitada = horaSolicitada;
	}

	public long getMonto() {
		return this.monto;
	}

	public void setMonto(long monto) {
		this.monto = monto;
	}

	public BigDecimal getStatus() {
		return this.status;
	}

	public void setStatus(BigDecimal status) {
		this.status = status;
	}

}