package com.cicili.app.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cicili.app.entity.CclDireccion;

public interface DireccionRepository extends CrudRepository<CclDireccion, Long>{
	  Iterable<CclDireccion> findAll();

}