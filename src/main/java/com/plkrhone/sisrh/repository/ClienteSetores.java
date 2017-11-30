package com.plkrhone.sisrh.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plkrhone.sisrh.model.ClienteSetor;

@Repository
public interface ClienteSetores extends JpaRepository<ClienteSetor,Integer>{
	@Override
	default List<ClienteSetor> findAll() {
		return findAll(new Sort(Sort.Direction.ASC, "nome"));
	}
}
