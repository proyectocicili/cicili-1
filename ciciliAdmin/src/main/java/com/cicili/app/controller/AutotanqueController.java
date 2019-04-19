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
import com.cicili.app.dao.AutotanqueRepository;
import com.cicili.app.entity.CclAclaracion;

import com.cicili.app.entity.CclAutotanque;
import com.cicili.app.entity.CclConcesionario;

@RestController
public class AutotanqueController {
  @Autowired
  AutotanqueRepository repository;
  
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
  
  @RequestMapping("/autotanques")
  public List<CclAutotanque> fetchAutoTanques(){
      
    return repository.findAll();
  }
  
  @RequestMapping("/autotanquesbyusuario")
  public List<CclAutotanque> fetchAutotanquesByUsuario(@RequestParam("idUsuario") String idUsuario){
      
    return repository.find(BigInteger.valueOf(Integer.parseInt(idUsuario)));
  }
  
  
  @PostMapping("/agregaautotanques")
  public CclAutotanque addAclaracion(@RequestParam("marca") String marca
		  ,@RequestParam("modelo") String modelo
		  ,@RequestParam("clave") String clave
		  ,@RequestParam("motor") String motor
		  ,@RequestParam("serie") String serie
		  ,@RequestParam("color") String color
		  ,@RequestParam("factura") String factura
		  ,@RequestParam("status") String status){
	  
	  CclAutotanque c = new CclAutotanque();
	  
	  
	  

    return repository.save(c);
  }
  
  
}