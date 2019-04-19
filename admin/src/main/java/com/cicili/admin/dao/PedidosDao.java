package com.cicili.admin.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.cicili.admin.entity.*;

public class PedidosDao {
	
	JdbcTemplate model;

	public void setTemplate(JdbcTemplate model) {
		this.model = model;
	}

	public List<Pedido> getPedidos() {
		
		Statement st = null;
		ResultSet rs = null;
		String sql = "SELECT id FROM cicili.ccl_pedidos ;";
		System.out.println(sql);
		
		java.util.List<Pedido> pedidos = new ArrayList<Pedido>();
		
		try {
			//return model.queryForObject(sql, new Object[] { correo, password }, new BeanPropertyRowMapper<Usuario>(Usuario.class));

			//Usuario u = (Usuario) model.queryForObject(sql, new BeanPropertyRowMapper<Usuario>(Usuario.class));
			
			List<Map<String, Object>> rows = model.queryForList(sql);
			for (Map row : rows) {
				Pedido customer = new Pedido(Integer.parseInt(String.valueOf(row.get("id"))));
				pedidos.add(customer);
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
