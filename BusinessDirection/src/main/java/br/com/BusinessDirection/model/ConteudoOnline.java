package br.com.BusinessDirection.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ConteudoOnline")
public class ConteudoOnline {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idConteudoOnline;

	@OneToOne
	@JoinColumn(name = "fk_ModalidadeMentoria_id")
	private ModalidadeMentoria modalidadeMentoria;

	private String conteudo;

	public ConteudoOnline() {
		super();
	}

	public ConteudoOnline(Long idConteudoOnline, ModalidadeMentoria modalidadeMentoria, String conteudo) {
		super();
		this.idConteudoOnline = idConteudoOnline;
		this.modalidadeMentoria = modalidadeMentoria;
		this.conteudo = conteudo;
	}

	public Long getIdConteudoOnline() {
		return idConteudoOnline;
	}

	public void setIdConteudoOnline(Long idConteudoOnline) {
		this.idConteudoOnline = idConteudoOnline;
	}

	public ModalidadeMentoria getModalidadeMentoria() {
		return modalidadeMentoria;
	}

	public void setModalidadeMentoria(ModalidadeMentoria modalidadeMentoria) {
		this.modalidadeMentoria = modalidadeMentoria;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	

}
