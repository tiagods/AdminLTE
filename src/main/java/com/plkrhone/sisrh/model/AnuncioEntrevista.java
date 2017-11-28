package com.plkrhone.sisrh.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="anuncio_entrevista")
public class AnuncioEntrevista {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="anuncio_id")
	private Anuncio anuncio;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="candidato_id")
	private Candidato candidato;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	@ManyToMany
    @JoinTable(name="anuncio_entrevista_avaliacao", joinColumns=
		{@JoinColumn(name="anuncio_entrevista_id")}, inverseJoinColumns=
			{@JoinColumn(name="avaliacao_id")})
	private Set<Avaliacao> avaliacao = new HashSet<>();
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the anuncio
	 */
	public Anuncio getAnuncio() {
		return anuncio;
	}
	/**
	 * @return the candidato
	 */
	public Candidato getCandidato() {
		return candidato;
	}
	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @return the avaliacao
	 */
	public Set<Avaliacao> getAvaliacao() {
		return avaliacao;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @param anuncio the anuncio to set
	 */
	public void setAnuncio(Anuncio anuncio) {
		this.anuncio = anuncio;
	}
	/**
	 * @param candidato the candidato to set
	 */
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/**
	 * @param avaliacao the avaliacao to set
	 */
	public void setAvaliacao(Set<Avaliacao> avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	
}
