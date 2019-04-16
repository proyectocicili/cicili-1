package com.cicili.admin.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Pedido {

	private int idPedido;
	private Long monto;
	private Long cantidad;
	private Date fecha;

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public Pedido(int idPedido) {
		super();
		this.idPedido = idPedido;
	}

	public Long getMonto() {
		return monto;
	}

	public void setMonto(Long monto) {
		this.monto = monto;
	}

	public Long getCantidad() {
		return cantidad;
	}

	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
