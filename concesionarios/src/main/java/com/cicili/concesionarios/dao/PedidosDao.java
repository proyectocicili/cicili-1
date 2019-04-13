package com.cicili.concesionarios.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.cicili.concesionarios.dao.UsuarioDao;
import com.cicili.core.*;

public class PedidosDao {
	
	JdbcTemplate model;

	public void setTemplate(JdbcTemplate model) {
		this.model = model;
	}

	public List<Pedido> getPedidos() {
		
		Statement st = null;
		ResultSet rs = null;
		String sql = "SELECT id, cantidad, monto, fecha_pedido FROM cicili.ccl_pedidos ;";
		System.out.println(sql);
		
		java.util.List<Pedido> pedidos = new ArrayList<Pedido>();
		
		try {
			//return model.queryForObject(sql, new Object[] { correo, password }, new BeanPropertyRowMapper<Usuario>(Usuario.class));

			//Usuario u = (Usuario) model.queryForObject(sql, new BeanPropertyRowMapper<Usuario>(Usuario.class));
			
			List<Map<String, Object>> rows = model.queryForList(sql);
			for (Map row : rows) {
				Pedido pedido = new Pedido(Integer.parseInt(String.valueOf(row.get("id"))));
				pedido.setCantidad((Long)row.get("cantidad"));
				pedido.setMonto((Long)row.get("monto"));
				pedido.setFecha((Timestamp)row.get("fecha_pedido"));
				
				pedidos.add(pedido);
			}
			
			return pedidos;

						
		} catch (NoSuchMethodError e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
			return null;
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
			return null;
		}
	}
	

}
