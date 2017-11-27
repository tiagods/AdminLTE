package com.plkrhone.sisrh.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.plkrhone.sisrh.model.Vaga;
import com.plkrhone.sisrh.repository.VagasRepositorio;
import com.plkrhone.sisrh.service.VagaService;

@Controller
@RequestMapping("/vagas")
public class ControllerVaga {
	private static final String VAGA_MENU="vaga/PesquisarVagas";
	private static final String VAGA_CADASTRO="vaga/CadastroVaga";
	
	@Autowired
	private VagasRepositorio vagas;
	@Autowired
	private VagaService vagaService;
	
	
	@RequestMapping(value="/novo",method = RequestMethod.POST)
	public ModelAndView cadastrar(@Valid Vaga vaga, BindingResult result, RedirectAttributes redirect) {
		if(result.hasErrors()) {
			return novo(vaga);
		}
		vagaService.salvar(vaga);
		ModelAndView mv = new ModelAndView("redirect:/vagas/novo");
		redirect.addFlashAttribute("mensagem", "Registro salvo com sucesso!");
		return mv;
	}
	
	@RequestMapping("/novo")
	public ModelAndView novo(Vaga vaga) {
		ModelAndView mv = new ModelAndView(VAGA_CADASTRO);
		return mv;
	}
	
	@GetMapping
	public ModelAndView pesquisar() {
		ModelAndView mv = new ModelAndView(VAGA_MENU);
		mv.addObject("vagas", vagas.findAll());
		return mv;
	}
	
}
