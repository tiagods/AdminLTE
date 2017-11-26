package com.plkrhone.sisrh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.plkrhone.sisrh.repository.VagasRepositorio;

@Controller
@RequestMapping("/vagas")
public class ControllerVaga {
	
	@Autowired
	private VagasRepositorio vagas;
	
	@GetMapping
	public ModelAndView pesquisar() {
		ModelAndView mv = new ModelAndView("vaga/PesquisarVagas");
		mv.addObject("vagas", vagas.findAll());
		return mv;
	}
	@RequestMapping("/novo")
	public ModelAndView novo() {
		return new ModelAndView("vaga/CadastroVaga");
	}
}
