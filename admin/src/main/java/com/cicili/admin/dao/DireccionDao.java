package com.cicili.admin.dao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.converters.BigIntegerConverter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cicili.admin.mapper.DireccionRowMapper;
import com.cicili.admin.dao.*;
import com.cicili.admin.mapper.*;
import com.cicili.core.*;
public class DireccionDao {

	JdbcTemplate model;

	public void setTemplate(JdbcTemplate model) {
		this.model = model;
	}

	public String inserta(Direccion direccion) {
		
		//System.out.println(idConcesionario + " " + nombre);
		Statement st = null;
		ResultSet rs = null;
		String sql = "INSERT INTO cicili.ccl_direcciones (calle, interior, exterior, usuario) VALUES(?,?,?,?)";
		System.out.println(sql);
		try {
						
			model.update(sql, direccion.getCalle(), direccion.getInterior(), direccion.getExterior(),1);
			
			return "ok";

						
		} catch (NoSuchMethodError e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
			return e.getMessage();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
			return e.getMessage();
		}
	}
	
	public List<Direccion> getDirecciones() {
		
		Statement st = null;
		ResultSet rs = null;
		String sql = "SELECT id, calle, interior, exterior FROM cicili.ccl_direcciones ;";
		System.out.println(sql);
		
		java.util.List<Direccion> direcciones = new ArrayList<Direccion>();
		
		try {
			//return model.queryForObject(sql, new Object[] { correo, password }, new BeanPropertyRowMapper<Usuario>(Usuario.class));

			//Usuario u = (Usuario) model.queryForObject(sql, new BeanPropertyRowMapper<Usuario>(Usuario.class));
			
			List<Map<String, Object>> rows = model.queryForList(sql);
			for (Map row : rows) {
				Direccion direccion = new Direccion();
				direccion.setIdDireccion( (Long)row.get("id") );
				direccion.setCalle((String)row.get("calle"));
				direccion.setInterior((String)row.get("interior"));
				direccion.setExterior((String)row.get("exterior"));
				direcciones.add(direccion);
			}
			
			return direcciones;

						
		} catch (NoSuchMethodError e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
			return null;
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
			return null;
		}
	}
	
	
	public Direccion getDireccionById(String id) {
		
		Statement st = null;
		ResultSet rs = null;
		String sql = "SELECT id, calle, interior, exterior FROM cicili.ccl_direcciones where id=? ;";
		System.out.println(sql);
		
		try {
			//return model.queryForObject(sql, new Object[] { correo, password }, new BeanPropertyRowMapper<Usuario>(Usuario.class));

			//Usuario u = (Usuario) model.queryForObject(sql, new BeanPropertyRowMapper<Usuario>(Usuario.class));
			
			Direccion direccion = model.queryForObject(sql, new Object[] {Long.valueOf(id)}, new DireccionRowMapper() );
						
			return direccion;
			
			
						
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
