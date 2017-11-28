package com.plkrhone.sisrh.model;

import javax.persistence.Embeddable;

@Embeddable
public class PfPj {
	private String email;
    private String telefone;
    private String celular;
    private String endereco;
    
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}
	/**
	 * @return the celular
	 */
	public String getCelular() {
		return celular;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	/**
	 * @param celular the celular to set
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}
	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
    
}
