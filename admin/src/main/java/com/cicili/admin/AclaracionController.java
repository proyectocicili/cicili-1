package com.cicili.admin;

import java.util.List;
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
import org.springframework.web.bind.annotation.ResponseBody;

import com.cicili.admin.dao.*;
import com.cicili.admin.entity.*;

@Controller
public class AclaracionController {
	
	@Autowired
	AclaracionDao model_aclaracion;
	
	
	@RequestMapping(value = "aclaracion", method = RequestMethod.GET
			, produces = "application/json; charset=UTF-8")
	@ResponseBody
	public Aclaracion aclaracion(HttpServletRequest request) {
		
		System.out.println(request.getParameter("id"));
		
		Aclaracion aclaracion = null;

		return aclaracion;
	}
	
	@RequestMapping(value = "aclaraciones", method = RequestMethod.GET)
	
	@ResponseBody
	public List<Aclaracion> aclaraciones() {
		List<Aclaracion> aclaraciones = model_aclaracion.getAclaraciones();

		return aclaraciones;
	}
	
	
	@RequestMapping(value = "registrarAclaracion", method = RequestMethod.POST)
	public String registrar(Locale locale, Model model, HttpServletRequest request
			, @Valid @ModelAttribute("aclaracion") Aclaracion aclaracion, BindingResult bindingResult, HttpServletResponse response) {

		model.addAttribute("error", 0);
		if (bindingResult.hasErrors()) {
			model.addAttribute("error", 1);
		}else {
			String respuesta = "";
			
			System.out.println("id aclaracion " + aclaracion.getIdAclaracion());
			
			if (aclaracion.getIdAclaracion()!=null) {
				respuesta = model_aclaracion.actualiza(aclaracion);
			} else {
				respuesta = model_aclaracion.inserta(aclaracion);
			}
			
			
			if(respuesta.equals("ok")) {
				
				String token = "Nuestra propia implementacin de tokens";
				
				request.getSession().setAttribute("token", token);
				
				try {
					response.sendRedirect("aclaraciones");
				
				}catch(Exception e) {
					model.addAttribute("error", 3);
				
				}
			}else {
				model.addAttribute("error", 2);
			}
		}

		return "aclaracion";
	}

}
