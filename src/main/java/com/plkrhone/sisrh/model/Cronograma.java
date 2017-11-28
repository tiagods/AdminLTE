package com.plkrhone.sisrh.model;

public enum Cronograma{
	DIVULGACAO_DA_VAGA("Divulgação da Vaga"),
	RECRUTEMENTO_DE_CURRICULOS("Recrutamento de currículos"),
	AGENDAMENTO_DE_ENTREVISTA("Agendamento de entrevista"),
	ENTREVISTAS_REALIZADAS("Entrevistas realizadas"),
	ENVIO_DE_CANDIDATO_PRE_SELECIONADO("Envio de candidado pré-selecionado"),
	RETORNO_DO_PROCESSO_SELETIVO("Retorno do processo seletivo"),
	TREINAMENTO("Treinamento");
	
	private String descricao;
	Cronograma(String descricao){
		this.descricao= descricao;
	}
	public String getDescricao() {
		return descricao;
	}
}
