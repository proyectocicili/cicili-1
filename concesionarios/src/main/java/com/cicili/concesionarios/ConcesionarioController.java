package com.cicili.concesionarios;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cicili.concesionarios.dao.*;
import com.cicili.core.*;
@Controller
public class ConcesionarioController {
	
	@Autowired
	ConcesionarioDao model_concesionario;
	
	
	@RequestMapping(value = "registro", method = RequestMethod.GET)
	public String concesionario(Locale locale, Model model, Concesionario concesionario, HttpServletRequest request) {
		model.addAttribute("error", 0);
		
		System.out.println(request.getParameter("id"));
		
		concesionario.setIdConcesionario(1);
		concesionario.setNombre("hola");
		model.addAttribute("concesionario", concesionario);

		return "registro";
	}
	
	
	@RequestMapping(value = "registrar", method = RequestMethod.POST)
	public String registrar(Locale locale, Model model, HttpServletRequest request
			, @Valid @ModelAttribute("concesionario") Concesionario concesionario, BindingResult bindingResult, HttpServletResponse response) {

		model.addAttribute("error", 0);
		if (bindingResult.hasErrors()) {
			model.addAttribute("error", 1);
		}else {
			String respuesta = model_concesionario.inserta(concesionario);
			
			if(respuesta.equals("ok")) {
				
				String token = "Nuestra propia implementación de tokens";
				
				request.getSession().setAttribute("token", token);
				
				try {
					response.sendRedirect("respuesta");
				
				}catch(Exception e) {
					model.addAttribute("error", 3);
				
				}
			}else {
				model.addAttribute("error", 2);
			}
		}

		return "registro";
	}

}
