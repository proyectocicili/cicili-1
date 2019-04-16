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

import com.cicili.admin.dao.*;
import com.cicili.admin.mapper.*;
import com.cicili.core.*;

public class AclaracionDao {

	JdbcTemplate model;

	public void setTemplate(JdbcTemplate model) {
		this.model = model;
	}

	public String inserta(Aclaracion aclaracion) {
		
		//System.out.println(idConcesionario + " " + nombre);
		Statement st = null;
		ResultSet rs = null;
		String sql = "INSERT INTO cicili.ccl_aclaraciones (usuario, aclaracion) VALUES(?,?)";
		System.out.println(sql);
		try {
						
			model.update(sql, 1, aclaracion.getAclaracion());
			
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
	
	public String actualiza(Aclaracion aclaracion) {
		
		//System.out.println(idConcesionario + " " + nombre);
		Statement st = null;
		ResultSet rs = null;
		String sql = "UPDATE cicili.ccl_aclaraciones SET usuario=?, aclaracion=? WHERE id=?";
		System.out.println(sql);
		try {
						
			model.update(sql, 1, aclaracion.getAclaracion(), aclaracion.getIdAclaracion());
			
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

	public List<Aclaracion> getAclaraciones() {
		
		Statement st = null;
		ResultSet rs = null;
		String sql = "SELECT id,aclaracion FROM cicili.ccl_aclaraciones ;";
		System.out.println(sql);
		
		java.util.List<Aclaracion> aclaraciones = new ArrayList<Aclaracion>();
		
		try {
			//return model.queryForObject(sql, new Object[] { correo, password }, new BeanPropertyRowMapper<Usuario>(Usuario.class));

			//Usuario u = (Usuario) model.queryForObject(sql, new BeanPropertyRowMapper<Usuario>(Usuario.class));
			
			List<Map<String, Object>> rows = model.queryForList(sql);
			for (Map row : rows) {
				Aclaracion aclaracion = new Aclaracion();
				aclaracion.setIdAclaracion( BigDecimal.valueOf( Long.parseLong(row.get("id").toString() ) ));
				aclaracion.setAclaracion(row.get("aclaracion").toString());
				aclaraciones.add(aclaracion);
			}
			
			return aclaraciones;

						
		} catch (NoSuchMethodError e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
			return null;
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
			return null;
		}
	}
	
	
	public Aclaracion getAclaracionById(String id) {
		
		Statement st = null;
		ResultSet rs = null;
		String sql = "SELECT id,aclaracion FROM cicili.ccl_aclaraciones where id=? ;";
		System.out.println(sql);
		
		try {
			//return model.queryForObject(sql, new Object[] { correo, password }, new BeanPropertyRowMapper<Usuario>(Usuario.class));

			//Usuario u = (Usuario) model.queryForObject(sql, new BeanPropertyRowMapper<Usuario>(Usuario.class));
			
			Aclaracion aclaracion = model.queryForObject(sql, new Object[] {Long.valueOf(id)}, new AclaracionRowMapper() );
						
			return aclaracion;

						
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
