package com.plkrhone.sisrh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.plkrhone.sisrh.model.Vaga;
import com.plkrhone.sisrh.repository.VagasRepositorio;

@Service
public class VagaService {
	@Autowired
	private VagasRepositorio vagas;
	
	@Transactional
	public void salvar(Vaga vaga) {
		vagas.save(vaga);
	}	
}
