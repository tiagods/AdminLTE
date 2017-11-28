package com.plkrhone.sisrh.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Cliente implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String nome;
    private String cnpj;
    private String responsavel;
    @Embedded
    private PfPj pessoaJuridica;
    @Column(name="cliente_contabil")
    private int clienteContabil;
    private int situacao = 1;
    
    @ManyToOne
    @JoinColumn(name="setor_id")
    private ClienteSetor setor;
    @ManyToOne
    @JoinColumn(name="criado_por_id")
    private Usuario criadoPor;
    @Temporal(TemporalType.DATE)
    @Column(name="criado_em")
    private Calendar criadoEm;
    @Column(name="anuncios_total")
    private int anunciosTotal=0;
    @Column(name="anuncios_abertos")
    private int anunciosAbertos=0;
    @Column(name="anuncios_fechados")
    private int anunciosFechados=0;
    
    @OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
    @JoinColumn(name="cliente_id")
    private Set<Anuncio> anuncioSet = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public PfPj getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(PfPj pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    public int getClienteContabil() {
        return clienteContabil;
    }

    public void setClienteContabil(int clienteContabil) {
        this.clienteContabil = clienteContabil;
    }
    
	/**
	 * @return the situacao
	 */
	public int getSituacao() {
		return situacao;
	}

	/**
	 * @param situacao the situacao to set
	 */
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}

	public ClienteSetor getSetor() {
        return setor;
    }

    public void setSetor(ClienteSetor setor) {
        this.setor = setor;
    }

    public Usuario getCriadoPor() {
        return criadoPor;
    }

    public void setCriadoPor(Usuario criadoPor) {
        this.criadoPor = criadoPor;
    }

    public Calendar getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(Calendar criadoEm) {
        this.criadoEm = criadoEm;
    }

    public int getAnunciosTotal() {
        return anunciosTotal;
    }

    public void setAnunciosTotal(int anunciosTotal) {
        this.anunciosTotal = anunciosTotal;
    }

    public int getAnunciosAbertos() {
        return anunciosAbertos;
    }

    public void setAnunciosAbertos(int anunciosAbertos) {
        this.anunciosAbertos = anunciosAbertos;
    }

    public int getAnunciosFechados() {
        return anunciosFechados;
    }

    public void setAnunciosFechados(int anunciosFechados) {
        this.anunciosFechados = anunciosFechados;
    }

    /* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
    public String toString() {
        String[] newName = this.nome.split(" ");
        return newName[0]+ " - " + this.cnpj;
    }
}
