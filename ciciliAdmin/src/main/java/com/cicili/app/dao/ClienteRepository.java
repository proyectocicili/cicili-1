package com.cicili.app.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cicili.app.entity.CclCliente;

public interface ClienteRepository extends CrudRepository<CclCliente, Long>{
	  List<CclCliente> findAll();

}