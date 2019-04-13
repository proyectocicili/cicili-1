package com.cicili.concesionarios.dao;

import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cicili.concesionarios.dao.*;
import com.cicili.concesionarios.mapper.*;
import com.cicili.core.*;

public class UsuarioDao {

	JdbcTemplate model;

	public void setTemplate(JdbcTemplate model) {
		this.model = model;
	}

	public Usuario login(String correo, String password) {
		
		System.out.println(correo + " " + password);
		Statement st = null;
		ResultSet rs = null;
		String sql = "SELECT 'erickidaly@gmail.com' as correo, password FROM cicili.ccl_usuarios ;";
		System.out.println(sql);
		try {
			//return model.queryForObject(sql, new Object[] { correo, password }, new BeanPropertyRowMapper<Usuario>(Usuario.class));

			//Usuario u = (Usuario) model.queryForObject(sql, new BeanPropertyRowMapper<Usuario>(Usuario.class));
			Usuario u = (Usuario) model.queryForObject(sql, new UsuarioRowMapper());
			System.out.println(u.getCorreo());
			return u;

						
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
