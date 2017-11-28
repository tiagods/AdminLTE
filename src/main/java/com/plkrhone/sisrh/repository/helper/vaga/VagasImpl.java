package com.plkrhone.sisrh.repository.helper.vaga;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.plkrhone.sisrh.model.Vaga;
import com.plkrhone.sisrh.repository.filter.VagaFilter;

public class VagasImpl implements VagasQueries {
	@PersistenceContext
	private EntityManager manager;
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly=true)
	public List<Vaga> filtrar(VagaFilter filtro) {
		Criteria c = manager.unwrap(Session.class).createCriteria(Vaga.class);
		if(filtro!=null)
			if(!StringUtils.isEmpty(filtro.getNome())) c.add(Restrictions.ilike("nome", filtro.getNome(), MatchMode.ANYWHERE));
		return (List<Vaga>)c.list();
	}

}
