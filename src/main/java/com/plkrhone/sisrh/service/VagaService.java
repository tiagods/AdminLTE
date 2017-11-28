package com.plkrhone.sisrh.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.plkrhone.sisrh.model.Vaga;
import com.plkrhone.sisrh.repository.Vagas;
import com.plkrhone.sisrh.service.exception.NomeVagaJaCadastradoException;

@Service
public class VagaService {
	@Autowired
	private Vagas vagas;
	
	@Transactional
	public Vaga salvar(Vaga vaga) throws NomeVagaJaCadastradoException {
		Optional<Vaga> optional = vagas.findByNomeIgnoreCase(vaga.getNome());
		if(optional.isPresent()) {
			throw new NomeVagaJaCadastradoException ("Nome da Vaga já existe");
		}
		return vagas.saveAndFlush(vaga);
		
	}	
}
