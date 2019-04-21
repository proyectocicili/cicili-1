package com.cicili.app.controller;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cicili.app.dao.AclaracionRepository;
import com.cicili.app.dao.ConductorRepository;
import com.cicili.app.entity.CclAclaracion;
import com.cicili.app.entity.CclConcesionario;
import com.cicili.app.entity.CclConductor;

@RestController
public class ConductorController {
  @Autowired
  ConductorRepository repository;
  
  /*
  @RequestMapping("/save")
  public String process(){
    // save a single Aclaracion
    repository.save(new Aclaracion());
    
    // save a list of Aclaracions
    repository.save(Arrays.asList(new Aclaracion("Adam", "Johnson"), new Aclaracion("Kim", "Smith"),
                    new Aclaracion("David", "Williams"), new Aclaracion("Peter", "Davis")));
    
    return "Done";
  }
  
  
  @RequestMapping("/findall")
  public String findAll(){
    String result = "";
    
    for(CclAclaracion cust : repository.findAll()){
      result += cust.toString() + "<br>";
    }
    
    return result;
  }
  
  @RequestMapping("/findbyid")
  public String findById(@RequestParam("id") long id){
    String result = "";
    result = repository.findOne(id).toString();
    return result;
  }
  
  @RequestMapping("/findbylastname")
  public String fetchDataByLastName(@RequestParam("lastname") String lastName){
    String result = "";
    
    for(Aclaracion cust: repository.findByLastName(lastName)){
      result += cust.toString() + "<br>"; 
    }
    
    return result;
  }
  */
  
  @RequestMapping("/conductores")
  public List<CclConductor> fetchCondutores(){
      
    return repository.findAll();
  }
  
  @RequestMapping("/conductoresbyconcesionario")
  public List<CclConductor> fetchConductoresByConcesionario(@RequestParam("idUsuario") String idUsuario){
      
    return repository.find(BigInteger.valueOf(Integer.parseInt(idUsuario)));
  }
  
  
  @PostMapping("/agregaconductor")
  public CclConductor addConductor(@RequestParam("usuario") String usuario
		  ,@RequestParam("concesionarioId") String concesionarioId
		  ,@RequestParam("licencia") String licencia
		  ,@RequestParam("ine") String ine){
	  
	  CclConductor c = new CclConductor();
	  c.setConcesionarioId(Long.parseLong(concesionarioId));
	  c.setChofer(Long.parseLong(usuario));
	  c.setIne(ine);
	  c.setLicencia(licencia);
	  c.setStatus(new BigDecimal(1));
	  
	  

    return repository.save(c);
  }
  
  
}