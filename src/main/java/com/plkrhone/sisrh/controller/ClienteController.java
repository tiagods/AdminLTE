package com.plkrhone.sisrh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.plkrhone.sisrh.model.Cliente;
import com.plkrhone.sisrh.model.ClienteSetor;
import com.plkrhone.sisrh.repository.ClienteSetores;

@Controller
@RequestMapping("/admin/clientes")
public class ClienteController {
	private static String CLIENTES_VIEW="admin/cliente/PesquisarClientes";
	private static String CLIENTES_CADASTRO="admin/cliente/CadastroCliente";
	
	@Autowired
	private ClienteSetores setores;
	
	@RequestMapping("/novo")
	public ModelAndView novo(Cliente cliente) {
		ModelAndView mv = new ModelAndView(CLIENTES_CADASTRO);
		return mv;
	}
	
	public ModelAndView pesquisar() {
		ModelAndView mv = new ModelAndView(CLIENTES_VIEW);
		return mv;
	}
	@ModelAttribute("setores")
	public List<ClienteSetor> listarSetores(){
		return setores.findAll();
	}
}
