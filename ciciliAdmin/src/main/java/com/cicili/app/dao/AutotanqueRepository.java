package com.cicili.app.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.cicili.app.entity.CclAclaracion;

import com.cicili.app.entity.CclAutotanque;

public interface AutotanqueRepository extends JpaRepository<CclAutotanque, Long> {
	
	List<CclAutotanque> findAll();

	@Query("SELECT c FROM CclAutotanque c ")
    public List<CclAutotanque> find(@Param("idUsuario") BigInteger idUsuario);

	
}