package com.cicili.admin.dao;

import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cicili.admin.dao.UsuarioDao;
import com.cicili.admin.entity.*;

public class ConcesionarioDao {

	JdbcTemplate model;

	public void setTemplate(JdbcTemplate model) {
		this.model = model;
	}

	public String inserta(Concesionario concesionario) {
		
		//System.out.println(idConcesionario + " " + nombre);
		Statement st = null;
		ResultSet rs = null;
		String sql = "INSERT INTO cicili.ccl_concesionarios (nombre, descripcion) VALUES(?,?)";
		System.out.println(sql);
		try {
						
			model.update(sql, concesionario.getNombre(), concesionario.getDescripcion());
			
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
	
}
