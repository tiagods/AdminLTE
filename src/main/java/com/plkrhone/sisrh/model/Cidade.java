package com.plkrhone.sisrh.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Cidade implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	@Enumerated(EnumType.STRING)
	private Estado estado;
	private String idExtra;
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
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the estado
	 */
	public Estado getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	/**
	 * @return the idExtra
	 */
	public String getIdExtra() {
		return idExtra;
	}
	/**
	 * @param idExtra the idExtra to set
	 */
	public void setIdExtra(String idExtra) {
		this.idExtra = idExtra;
	}

	@Override
	public String toString() {
		return this.nome;
	}
}
