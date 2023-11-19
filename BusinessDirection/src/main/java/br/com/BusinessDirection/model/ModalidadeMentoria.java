package br.com.BusinessDirection.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ModalidadeMentoria")
public class ModalidadeMentoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(mappedBy = "modalidadeMentoria", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_ConteudoOnline_id")
	private ConteudoOnline conteudoOnline;

	private String nomeModalidade;

//	talvez criar um metodo que calcula a qtd e passa o valor pra ca
	private int qtdMentores;
	private int qtdEmpreendedores;

	public ModalidadeMentoria() {
		super();
	}

	public ModalidadeMentoria(Long id, ConteudoOnline conteudoOnline, String nomeModalidade, int qtdMentores,
			int qtdEmpreendedores) {
		super();
		this.id = id;
		this.conteudoOnline = conteudoOnline;
		this.nomeModalidade = nomeModalidade;
		this.qtdMentores = qtdMentores;
		this.qtdEmpreendedores = qtdEmpreendedores;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ConteudoOnline getConteudoOnline() {
		return conteudoOnline;
	}

	public void setConteudoOnline(ConteudoOnline conteudoOnline) {
		this.conteudoOnline = conteudoOnline;
	}

	public String getNomeModalidade() {
		return nomeModalidade;
	}

	public void setNomeModalidade(String nomeModalidade) {
		this.nomeModalidade = nomeModalidade;
	}

	public int getQtdMentores() {
		return qtdMentores;
	}

	public void setQtdMentores(int qtdMentores) {
		this.qtdMentores = qtdMentores;
	}

	public int getQtdEmpreendedores() {
		return qtdEmpreendedores;
	}

	public void setQtdEmpreendedores(int qtdEmpreendedores) {
		this.qtdEmpreendedores = qtdEmpreendedores;
	}

	@Override
	public String toString() {
		return "ModalidadeMentoria [id=" + id + ", conteudoOnline=" + conteudoOnline + ", nomeModalidade="
				+ nomeModalidade + ", qtdMentores=" + qtdMentores + ", qtdEmpreendedores=" + qtdEmpreendedores + "]";
	}

}
