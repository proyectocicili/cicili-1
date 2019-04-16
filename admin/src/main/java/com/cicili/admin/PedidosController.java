package com.cicili.admin;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cicili.admin.dao.PedidosDao;
import com.cicili.admin.dao.UsuarioDao;
import com.cicili.core.*;

@Controller
public class PedidosController {

	@Autowired
	PedidosDao model_pedidos;
	
	@RequestMapping(value = "pedidos", method = RequestMethod.GET
			, produces = "application/json; charset=UTF-8")
	
	@ResponseBody
	public List<Pedido> home() {
		
		
		List<Pedido> pedidos = model_pedidos.getPedidos();
		
		         
		return pedidos;
	}

	
	
	
}
