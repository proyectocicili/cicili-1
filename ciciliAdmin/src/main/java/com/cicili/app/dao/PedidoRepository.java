package com.cicili.app.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.cicili.app.entity.CclAclaracion;
import com.cicili.app.entity.CclPedido;

public interface PedidoRepository extends JpaRepository<CclPedido, Long> {
	
	List<CclPedido> findAll();

	@Query("SELECT c FROM CclPedido c WHERE cliente=?1 ")
    public List<CclPedido> find(@Param("idUsuario") long idUsuario);

	
}