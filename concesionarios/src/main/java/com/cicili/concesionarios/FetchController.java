package com.cicili.concesionarios;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cicili.concesionarios.dao.*;
import com.cicili.core.*;

@Controller
public class FetchController {
	
	@Autowired
	AclaracionDao model_aclaracion;
	
	@Autowired
	DireccionDao model_direccion;
	
	
	@RequestMapping(value = "fetch", method = RequestMethod.GET)
	public void Fetch(Locale locale, Model model, HttpServletRequest request,  HttpServletResponse response) {
		
		String regresa = "";
		
		String id = (String)request.getParameter("id") ;
		String tipo = (String)request.getParameter("tipo") ;
		
		//model.addAttribute("error", 0);
		if (tipo.equals("aclaracion")) {
			 
			Aclaracion aclaracion = model_aclaracion.getAclaracionById(id);
			
			request.getSession().setAttribute("aclaracion", aclaracion);
			
			model.addAttribute("aclaracion", aclaracion);
			regresa = "aclaracion";
			
			try {
				response.sendRedirect("aclaracion");
				return;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		if (tipo.equals("direccion")) {
			 
			Direccion direccion = model_direccion.getDireccionById(id);
			
			model.addAttribute("direccion", direccion);
			
			request.getSession().setAttribute("direccion", direccion);
			
			regresa = "direccion";
			
			try {
				response.sendRedirect("direccion");
				return;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//return;
		}
		
		//return regresa;
		
		
		
	}
	

}
