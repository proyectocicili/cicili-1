package com.cicili.app.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cicili.app.dao.AclaracionRepository;
import com.cicili.app.dao.ClienteRepository;
import com.cicili.app.dao.DireccionRepository;
import com.cicili.app.entity.CclAclaracion;
import com.cicili.app.entity.CclCliente;
import com.cicili.app.entity.CclDireccion;

@RestController
public class ClienteController {
  @Autowired
  ClienteRepository repository;
  
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
  
  @RequestMapping("/findallclientes")
  public String findAll(){
    String result = "";
    
    for(CclCliente cust : repository.findAll()){
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
  
  @RequestMapping("/clientes")
  public @ResponseBody Iterable<CclCliente> fetchClientes(){
  
    return repository.findAll();
  }
  
}