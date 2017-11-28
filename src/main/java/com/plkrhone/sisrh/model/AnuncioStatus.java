package com.plkrhone.sisrh.model;

public enum AnuncioStatus {
	EM_ANDAMENTO("Em Andamento"),
	DECLINADO("Declinado"),
	FECHADO("Fechado");
	
	private String descricao;
	
	AnuncioStatus(String descricao){
		this.descricao=descricao;
	}
	public String getDescricao() {
		return descricao;
	}
}

