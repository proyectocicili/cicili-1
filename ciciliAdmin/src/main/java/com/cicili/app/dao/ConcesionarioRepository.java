package com.cicili.app.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.cicili.app.entity.CclAclaracion;
import com.cicili.app.entity.CclConcesionario;

public interface ConcesionarioRepository extends JpaRepository<CclConcesionario, Long> {
	
	List<CclConcesionario> findAll();

	@Query("SELECT c FROM CclConcesionario c WHERE id=?1 ")
    public List<CclConcesionario> find(@Param("idUsuario") long idUsuario);

	
}