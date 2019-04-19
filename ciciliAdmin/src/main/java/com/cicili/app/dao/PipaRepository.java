package com.cicili.app.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.cicili.app.entity.CclAclaracion;
import com.cicili.app.entity.CclPipa;

public interface PipaRepository extends JpaRepository<CclPipa, Long> {
	
	List<CclPipa> findAll();

	@Query("SELECT c FROM CclPipa c WHERE usuario=?1 ")
    public List<CclPipa> find(@Param("idUsuario") BigInteger idUsuario);

	
}