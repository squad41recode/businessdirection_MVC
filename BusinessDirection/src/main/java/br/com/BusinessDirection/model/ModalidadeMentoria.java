package br.com.BusinessDirection.model;

import jakarta.persistence.Entity;
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
	private Long idModalidadeMentoria;

	@OneToOne
	@JoinColumn(name = "fk_ConteudoOnline_id")
	private ConteudoOnline conteudoOnline;

	private String nomeModalidade;
	private int qtdMentores;
	private int qtdEmpreendedores;

	public ModalidadeMentoria() {
		super();
	}

	public ModalidadeMentoria(Long idModalidadeMentoria, ConteudoOnline conteudoOnline, String nomeModalidade,
			int qtdMentores, int qtdEmpreendedores) {
		super();
		this.idModalidadeMentoria = idModalidadeMentoria;
		this.conteudoOnline = conteudoOnline;
		this.nomeModalidade = nomeModalidade;
		this.qtdMentores = qtdMentores;
		this.qtdEmpreendedores = qtdEmpreendedores;
	}

	public Long getIdModalidadeMentoria() {
		return idModalidadeMentoria;
	}

	public void setIdModalidadeMentoria(Long idModalidadeMentoria) {
		this.idModalidadeMentoria = idModalidadeMentoria;
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
		return "ModalidadeMentoria [idModalidadeMentoria=" + idModalidadeMentoria + ", conteudoOnline=" + conteudoOnline
				+ ", nomeModalidade=" + nomeModalidade + ", qtdMentores=" + qtdMentores + ", qtdEmpreendedores="
				+ qtdEmpreendedores + "]";
	}

}
