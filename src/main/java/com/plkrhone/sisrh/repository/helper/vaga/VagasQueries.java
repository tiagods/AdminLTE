package com.plkrhone.sisrh.repository.helper.vaga;

import java.util.List;

import com.plkrhone.sisrh.model.Vaga;
import com.plkrhone.sisrh.repository.filter.VagaFilter;

public interface VagasQueries {
	public List<Vaga> filtrar(VagaFilter filtro);
}
