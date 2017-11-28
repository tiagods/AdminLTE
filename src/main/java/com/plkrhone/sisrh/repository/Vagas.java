package com.plkrhone.sisrh.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plkrhone.sisrh.model.Vaga;
import com.plkrhone.sisrh.repository.helper.vaga.VagasQueries;

@Repository
public interface Vagas extends JpaRepository<Vaga, Integer>,VagasQueries{
		
	Optional<Vaga> findByNomeIgnoreCase(String nome);
	@Override
	default List<Vaga> findAll() {
		return findAll(new Sort(Sort.Direction.ASC, "nome"));
	}
}
