package com.plkrhone.sisrh.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Usuario implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int ativo = 1;
	private String login;
	private String nome;
	private String senha;
	@Embedded
	private PfPj pessoaFisica;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "criado_em")
	private Calendar criadoEm;
	@ManyToOne
	@JoinColumn(name = "criado_por_id")
	private Usuario criadoPor;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ultimo_acesso")
	private Calendar ultimoAcesso;
	@Enumerated(EnumType.STRING)
	private UsuarioNivel nivel;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the ativo
	 */
	public int getAtivo() {
		return ativo;
	}
	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}
	/**
	 * @return the pessoaFisica
	 */
	public PfPj getPessoaFisica() {
		return pessoaFisica;
	}
	/**
	 * @return the criadoEm
	 */
	public Calendar getCriadoEm() {
		return criadoEm;
	}
	/**
	 * @return the criadoPor
	 */
	public Usuario getCriadoPor() {
		return criadoPor;
	}
	/**
	 * @return the ultimoAcesso
	 */
	public Calendar getUltimoAcesso() {
		return ultimoAcesso;
	}
	/**
	 * @return the nivel
	 */
	public UsuarioNivel getNivel() {
		return nivel;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @param ativo the ativo to set
	 */
	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}
	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	/**
	 * @param pessoaFisica the pessoaFisica to set
	 */
	public void setPessoaFisica(PfPj pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}
	/**
	 * @param criadoEm the criadoEm to set
	 */
	public void setCriadoEm(Calendar criadoEm) {
		this.criadoEm = criadoEm;
	}
	/**
	 * @param criadoPor the criadoPor to set
	 */
	public void setCriadoPor(Usuario criadoPor) {
		this.criadoPor = criadoPor;
	}
	/**
	 * @param ultimoAcesso the ultimoAcesso to set
	 */
	public void setUltimoAcesso(Calendar ultimoAcesso) {
		this.ultimoAcesso = ultimoAcesso;
	}
	/**
	 * @param nivel the nivel to set
	 */
	public void setNivel(UsuarioNivel nivel) {
		this.nivel = nivel;
	}
	
	
}
