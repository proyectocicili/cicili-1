package com.cicili.concesionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cicili.concesionarios.dao.*;
import com.cicili.core.*;

@Controller
public class DireccionController {

	@Autowired
	DireccionDao model_direccion;
	
	
	
	@RequestMapping(value = "direccion", method = RequestMethod.GET)
	public String aclaracion(Locale locale, Model model, Direccion direccion, HttpServletRequest request) {
		model.addAttribute("error", 0);
		
		System.out.println(request.getParameter("id"));
		/*
		concesionario.setIdConcesionario(1);
		concesionario.setNombre("hola");
		*/
		
		model.addAttribute("direccion", request.getSession().getAttribute("direccion"));

		return "direccion";
	}
	
	
	
	
	
	
	@RequestMapping(value = "direcciones", method = RequestMethod.GET)
	public String pedidos(Locale locale, Model model) {
		
	
		List<Direccion> direcciones = model_direccion.getDirecciones();
		
		//model.addAttribute("error", 0);
		model.addAttribute("direcciones", direcciones);
		
		
		
		return "direcciones";
	}

	
	
	
}
