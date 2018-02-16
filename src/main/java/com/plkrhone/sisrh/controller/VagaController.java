package com.plkrhone.sisrh.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.plkrhone.sisrh.model.Vaga;
import com.plkrhone.sisrh.repository.Vagas;
import com.plkrhone.sisrh.repository.filter.VagaFilter;
import com.plkrhone.sisrh.service.VagaService;
import com.plkrhone.sisrh.service.exception.NomeVagaJaCadastradoException;

@Controller
@RequestMapping("/admin/vagas")
public class VagaController {
	private static final String VAGA_MENU="admin/vaga/PesquisarVagas";
	private static final String VAGA_CADASTRO="admin/vaga/CadastroVaga";
	
	@Autowired
	private Vagas vagas;
	@Autowired
	private VagaService vagaService;
	
	
	@RequestMapping(value="/novo",method = RequestMethod.POST)
	public ModelAndView cadastrar(@Valid Vaga vaga, BindingResult result, RedirectAttributes redirect) {
		if(result.hasErrors()) {
			return novo(vaga);
		}
		try {
			vagaService.salvar(vaga);
		} catch (NomeVagaJaCadastradoException e) {
			result.rejectValue("nome", e.getMessage(), e.getMessage());
			return novo(vaga);
		}
		ModelAndView mv = new ModelAndView("redirect:/admin/vagas/novo");
		redirect.addFlashAttribute("mensagem", "Registro salvo com sucesso!");
		return mv;
	}
	
	@RequestMapping("/novo")
	public ModelAndView novo(Vaga vaga) {
		ModelAndView mv = new ModelAndView(VAGA_CADASTRO);
		return mv;
	}
	
	@GetMapping
	public ModelAndView pesquisar(VagaFilter vagaFilter) {
		ModelAndView mv = new ModelAndView(VAGA_MENU);
		mv.addObject("vagas", vagas.filtrar(vagaFilter));
		return mv;
	}
	
}
