package com.cicili.admin.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cicili.admin.dao.UsuarioDao;
import com.cicili.core.*;

public class DireccionRowMapper implements RowMapper
{
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Direccion direccion = new Direccion();
		direccion.setIdDireccion(rs.getLong("id"));
		direccion.setCalle(rs.getString("calle"));
		direccion.setInterior(rs.getString("interior"));
		direccion.setExterior(rs.getString("exterior"));
		
		return direccion;
	}
	
}