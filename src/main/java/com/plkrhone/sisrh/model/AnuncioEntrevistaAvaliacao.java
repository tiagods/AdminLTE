package com.plkrhone.sisrh.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="anuncio_entrevista_avaliacao")
public class AnuncioEntrevistaAvaliacao implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="avaliacao_id")
	private Avaliacao avaliacao;
	
	@ManyToOne
	@JoinColumn(name="anuncio_entrevista_id")
	private AnuncioEntrevista anuncioEntrevista;
	
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the avaliacao
	 */
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}
	/**
	 * @param avaliacao the avaliacao to set
	 */
	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}
	/**
	 * @return the anuncioEntrevista
	 */
	public AnuncioEntrevista getAnuncioEntrevista() {
		return anuncioEntrevista;
	}
	/**
	 * @param anuncioEntrevista the anuncioEntrevista to set
	 */
	public void setAnuncioEntrevista(AnuncioEntrevista anuncioEntrevista) {
		this.anuncioEntrevista = anuncioEntrevista;
	}
	
}
