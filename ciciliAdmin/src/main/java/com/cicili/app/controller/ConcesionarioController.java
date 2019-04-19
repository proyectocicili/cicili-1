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
import com.cicili.app.dao.ConcesionarioRepository;
import com.cicili.app.entity.CclAclaracion;
import com.cicili.app.entity.CclConcesionario;

@RestController
public class ConcesionarioController {
  @Autowired
  ConcesionarioRepository repository;
  
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
  */
  
  @RequestMapping("/findall")
  public String findAll(){
    String result = "";
    
    for(CclConcesionario cust : repository.findAll()){
      result += cust.toString() + "<br>";
    }
    
    return result;
  }
  /*
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
  
  @RequestMapping("/concesionarios")
  public List<CclConcesionario> fetchAclaraciones(){
      
    return repository.findAll();
  }
  
  @RequestMapping("/concesionariobyusuario")
  public List<CclConcesionario> fetchConcesionarioByUsuario(@RequestParam("idUsuario") String idUsuario){
      
    return repository.find(Long.parseLong(idUsuario));
  }
  
  
  @PostMapping("/agregaconcesionario")
  public CclConcesionario addConcesionario(@RequestParam("nombre") String nombre
		  ,@RequestParam("descripcion") String descripcion
		  ,@RequestParam("status") long status){
	  
	  CclConcesionario c = new CclConcesionario();
	  c.setNombre(nombre);
	  c.setDescripcion(descripcion);
	  c.setStatus(status);

    return repository.save(c);
  }
  
  
}