package com.cicili.app.controller;

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
import com.cicili.app.entity.CclAclaracion;
import com.cicili.app.entity.CclConcesionario;

@RestController
public class AclaracionController {
  @Autowired
  AclaracionRepository repository;
  
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
  
  @RequestMapping("/aclaraciones")
  public List<CclAclaracion> fetchAclaraciones(){
      
    return repository.findAll();
  }
  
  @RequestMapping("/aclaracionesbyusuario")
  public List<CclAclaracion> fetchAclaracionesByUsuario(@RequestParam("idUsuario") String idUsuario){
      
    return repository.find(BigInteger.valueOf(Integer.parseInt(idUsuario)));
  }
  
  
  @PostMapping("/agregaaclaracion")
  public CclAclaracion addAclaracion(@RequestParam("aclaracion") String aclaracion){
	  
	  CclAclaracion c = new CclAclaracion();
	  c.setAclaracion(aclaracion);
	  c.setUsuario(1);
	  
	  

    return repository.save(c);
  }
  
  
}