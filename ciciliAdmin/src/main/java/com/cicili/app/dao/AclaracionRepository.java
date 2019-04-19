package com.cicili.app.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.cicili.app.entity.CclAclaracion;

public interface AclaracionRepository extends JpaRepository<CclAclaracion, Long> {
	
	List<CclAclaracion> findAll();

	@Query("SELECT c FROM CclAclaracion c WHERE usuario=?1 ")
    public List<CclAclaracion> find(@Param("idUsuario") BigInteger idUsuario);

	
}