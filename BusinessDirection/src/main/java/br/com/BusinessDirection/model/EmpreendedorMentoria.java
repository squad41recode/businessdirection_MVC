package br.com.BusinessDirection.model;

import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "EmpreendedorMentoria")
public class EmpreendedorMentoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empreendedorMentoria;

	@OneToOne
	@JoinColumn(name = "fk_MentorModalidade_id")
	private MentorModalidade mentorModalidade;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "fk_Empreendedor_id")
	private Empreendedor empreendedor;

	private String status;
	private int encontrosFeitos;
	private int faltas;

	public Long getempreendedorMentoria() {
		return empreendedorMentoria;
	}

	public void setempreendedorMentoria(Long empreendedorMentoria) {
		this.empreendedorMentoria = empreendedorMentoria;
	}

	public MentorModalidade getmentormodalidade() {
		return mentorModalidade;
	}

	public void setmentormodalidade(MentorModalidade mentorModalidade) {
		this.mentorModalidade = mentorModalidade;
	}

	public Empreendedor getempreendedor() {
		return empreendedor;
	}

	public void setempreendedor(Empreendedor empreendedor) {
		this.empreendedor = empreendedor;
	}

	public String getStatua() {
		return status;
	}

	public void setStatua(String status) {
		this.status = status;
	}

	public int getEncontros_feitos() {
		return encontrosFeitos;
	}

	public void setEncontros_feitos(int encontrosFeitos) {
		this.encontrosFeitos = encontrosFeitos;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(encontrosFeitos, faltas, empreendedor, empreendedorMentoria, mentorModalidade, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpreendedorMentoria other = (EmpreendedorMentoria) obj;
		return encontrosFeitos == other.encontrosFeitos && faltas == other.faltas
				&& Objects.equals(empreendedor, other.empreendedor)
				&& Objects.equals(empreendedorMentoria, other.empreendedorMentoria)
				&& Objects.equals(mentorModalidade, other.mentorModalidade) && Objects.equals(status, other.status);
	}

	@Override
	public String toString() {
		return "EmpreendedorMentoria [empreendedorMentoria=" + empreendedorMentoria + ", mentorModalidade="
				+ mentorModalidade + ", empreendedor=" + empreendedor + ", status=" + status + ", encontrosFeitos="
				+ encontrosFeitos + ", faltas=" + faltas + "]";
	}

	public EmpreendedorMentoria(Long empreendedorMentoria, MentorModalidade mentorModalidade, Empreendedor empreendedor,
			String status, int encontrosFeitos, int faltas) {
		super();
		this.empreendedorMentoria = empreendedorMentoria;
		this.mentorModalidade = mentorModalidade;
		this.empreendedor = empreendedor;
		this.status = status;
		this.encontrosFeitos = encontrosFeitos;
		this.faltas = faltas;
	}

	public EmpreendedorMentoria(MentorModalidade mentorModalidade, Empreendedor empreendedor, String status,
			int encontrosFeitos, int faltas) {
		super();
		this.mentorModalidade = mentorModalidade;
		this.empreendedor = empreendedor;
		this.status = status;
		this.encontrosFeitos = encontrosFeitos;
		this.faltas = faltas;
	}

}