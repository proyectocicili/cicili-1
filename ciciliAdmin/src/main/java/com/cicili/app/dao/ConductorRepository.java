package com.cicili.app.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.cicili.app.entity.CclAclaracion;
import com.cicili.app.entity.CclConductor;

public interface ConductorRepository extends JpaRepository<CclConductor, Long> {
	
	List<CclConductor> findAll();

	@Query("SELECT c FROM CclConductor c WHERE concesionario_id=?1 ")
    public List<CclConductor> find(@Param("idUsuario") BigInteger idUsuario);

	
}