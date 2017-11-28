package com.plkrhone.sisrh.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.*;

@Entity
public class Candidato implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    @Temporal(TemporalType.TIMESTAMP)
	private Calendar criadoEm;
    @ManyToOne
    @JoinColumn(name="criado_por_id")
    private Usuario criadoPor;
    private String nome;
    private String sexo;
    @Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
    @Column(name="estado_civil")
    private String estadoCivil;
    private int fumante;
    private int filhos;
    private int qtdeFilhos;
    private String escolaridade;
    @Enumerated(EnumType.STRING)
    private Nacionalidade nacionalidade;
    @Embedded
    private PfPj pessoaFisica;
    private String formulario;
    private int indicacao;
    @Column(name="empresa_indicacao")
    private String empresaIndicacao;
    @Column(name="detalhes_indicacao")
    private String detalhesIndicacao;

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(Calendar criadoEm) {
        this.criadoEm = criadoEm;
    }

    public Usuario getCriadoPor() {
        return criadoPor;
    }

    public void setCriadoPor(Usuario criadoPor) {
        this.criadoPor = criadoPor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getFumante() {
        return fumante;
    }

    public void setFumante(int fumante) {
        this.fumante = fumante;
    }

    public int getFilhos() {
        return filhos;
    }

    public void setFilhos(int filhos) {
        this.filhos = filhos;
    }

    public int getQtdeFilhos() {
        return qtdeFilhos;
    }

    public void setQtdeFilhos(int qtdeFilhos) {
        this.qtdeFilhos = qtdeFilhos;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    /**
	 * @return the nacionalidade
	 */
	public Nacionalidade getNacionalidade() {
		return nacionalidade;
	}

	/**
	 * @param nacionalidade the nacionalidade to set
	 */
	public void setNacionalidade(Nacionalidade nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public PfPj getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(PfPj pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public String getFormulario() {
        return formulario;
    }

    public void setFormulario(String formulario) {
        this.formulario = formulario;
    }


    /**
	 * @return the indicacao
	 */
	public int getIndicacao() {
		return indicacao;
	}

	/**
	 * @param indicacao the indicacao to set
	 */
	public void setIndicacao(int indicacao) {
		this.indicacao = indicacao;
	}

	public String getEmpresaIndicacao() {
        return empresaIndicacao;
    }

    public void setEmpresaIndicacao(String empresaIndicacao) {
        this.empresaIndicacao = empresaIndicacao;
    }

    public String getDetalhesIndicacao() {
        return detalhesIndicacao;
    }

    public void setDetalhesIndicacao(String detalhesIndicacao) {
        this.detalhesIndicacao = detalhesIndicacao;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
