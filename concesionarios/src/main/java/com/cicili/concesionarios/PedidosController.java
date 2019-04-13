package com.cicili.concesionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cicili.concesionarios.dao.*;
import com.cicili.core.*;
@Controller
public class PedidosController {

	@Autowired
	PedidosDao model_pedidos;
	
	@RequestMapping(value = "pedidos", method = RequestMethod.GET)
	public String pedidos(Locale locale, Model model) {
		
	
		List<Pedido> pedidos = model_pedidos.getPedidos();
		
		//model.addAttribute("error", 0);
		model.addAttribute("pedidos", pedidos);
		
		
		
		return "pedidos";
	}

	
	
	
}
