package com.cicili.admin.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cicili.core.*;

public class UsuarioRowMapper implements RowMapper
{
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Usuario customer = new Usuario();
		customer.setCorreo(rs.getString("CORREO"));
		customer.setPassword(rs.getString("PASSWORD"));

		return customer;
	}
	
}