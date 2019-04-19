package com.cicili.app.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cicili.app.dao.AclaracionRepository;
import com.cicili.app.dao.DireccionRepository;
import com.cicili.app.entity.CclAclaracion;
import com.cicili.app.entity.CclConcesionario;
import com.cicili.app.entity.CclDireccion;

@RestController
public class DireccionController {
  @Autowired
  DireccionRepository repository;
  
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
  
  @RequestMapping("/findalldirecciones")
  public String findAll(){
    String result = "";
    
    for(CclDireccion cust : repository.findAll()){
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
  
  @RequestMapping("/direcciones")
  public @ResponseBody Iterable<CclDireccion> fetchDirecciones(){
  
    return repository.findAll();
  }
  
  @PostMapping("/agregadireccion")
  public CclDireccion addDireccion(@RequestParam("calle") String calle
		  ,@RequestParam("asentamiento") String asentamiento
		  ,@RequestParam("exterior") String exterior
		  ,@RequestParam("interior") String interior
		  ,@RequestParam("region") String region
		  ,@RequestParam("status") String status){
	  
	  CclDireccion c = new CclDireccion();
	  c.setAsentamiento(Long.parseLong(asentamiento));
	  c.setCalle(calle);
	  c.setExterior(exterior);
	  c.setInterior(interior);
	  c.setRegion(Long.parseLong(region));
	  c.setStatus(new BigDecimal(status));
	  
    return repository.save(c);
  }
  
}