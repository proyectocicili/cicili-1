package com.cicili.concesionarios;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cicili.concesionarios.dao.UsuarioDao;
import com.cicili.core.*;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	UsuarioDao model_usuario;
	Tools tools = new Tools();

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model, Usuario usuario) {
		model.addAttribute("error", 0);
		model.addAttribute("usuario", usuario);

		return "home";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(Locale locale, Model model, HttpServletRequest request
			, @Valid @ModelAttribute("usuario") Usuario usuario, BindingResult bindingResult, HttpServletResponse response) {

		model.addAttribute("error", 0);
		if (bindingResult.hasErrors()) {
			model.addAttribute("error", 1);
		}else {
			Usuario login = model_usuario.login(usuario.getCorreo(), tools.sha256(usuario.getPassword()));
			if(login!=null) {
				String token = "Nuestra propia implementación de tokens";
				request.getSession().setAttribute("token", token);
				try {
					response.sendRedirect("login_correcto");
				}catch(Exception e) {
					model.addAttribute("error", 3);
				}
			}else {
				model.addAttribute("error", 2);
			}
		}

		return "home";
	}
	
}
