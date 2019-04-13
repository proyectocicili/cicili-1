package com.cicili.concesionarios.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cicili.concesionarios.dao.UsuarioDao;
import com.cicili.core.*;

public class AclaracionRowMapper implements RowMapper
{
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Aclaracion aclaracion = new Aclaracion();
		aclaracion.setIdAclaracion(rs.getBigDecimal("id"));
		aclaracion.setAclaracion(rs.getString("aclaracion"));

		return aclaracion;
	}
	
}