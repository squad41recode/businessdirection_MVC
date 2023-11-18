package br.com.BusinessDirection.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
	private MentorModalidade mentormodalidade;

	@OneToOne
	@JoinColumn(name = "fk_Empreendedor_id")
	private Empreendedor empreendedor;

	private String statua;
	private int encontros_feitos;
	private int faltas;

	public Long getempreendedorMentoria() {
		return empreendedorMentoria;
	}

	public void setempreendedorMentoria(Long empreendedorMentoria) {
		this.empreendedorMentoria = empreendedorMentoria;
	}

	public MentorModalidade getmentormodalidade() {
		return mentormodalidade;
	}

	public void setmentormodalidade(MentorModalidade mentormodalidade) {
		this.mentormodalidade = mentormodalidade;
	}

	public Empreendedor getempreendedor() {
		return empreendedor;
	}

	public void setempreendedor(Empreendedor empreendedor) {
		this.empreendedor = empreendedor;
	}

	public String getStatua() {
		return statua;
	}

	public void setStatua(String statua) {
		this.statua = statua;
	}

	public int getEncontros_feitos() {
		return encontros_feitos;
	}

	public void setEncontros_feitos(int encontros_feitos) {
		this.encontros_feitos = encontros_feitos;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(encontros_feitos, faltas, empreendedor, empreendedorMentoria, mentormodalidade,
				statua);
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
		return encontros_feitos == other.encontros_feitos && faltas == other.faltas
				&& Objects.equals(empreendedor, other.empreendedor)
				&& Objects.equals(empreendedorMentoria, other.empreendedorMentoria)
				&& Objects.equals(mentormodalidade, other.mentormodalidade) && Objects.equals(statua, other.statua);
	}

	@Override
	public String toString() {
		return "EmpreendedorMentoria [empreendedorMentoria=" + empreendedorMentoria + ", mentormodalidade="
				+ mentormodalidade + ", empreendedor=" + empreendedor + ", statua=" + statua
				+ ", encontros_feitos=" + encontros_feitos + ", faltas=" + faltas + "]";
	}

	public EmpreendedorMentoria(Long empreendedorMentoria, MentorModalidade mentormodalidade,
			Empreendedor empreendedor, String statua, int encontros_feitos, int faltas) {
		super();
		this.empreendedorMentoria = empreendedorMentoria;
		this.mentormodalidade = mentormodalidade;
		this.empreendedor = empreendedor;
		this.statua = statua;
		this.encontros_feitos = encontros_feitos;
		this.faltas = faltas;
	}

	public EmpreendedorMentoria(MentorModalidade mentormodalidade, Empreendedor empreendedor, String statua,
			int encontros_feitos, int faltas) {
		super();
		this.mentormodalidade = mentormodalidade;
		this.empreendedor = empreendedor;
		this.statua = statua;
		this.encontros_feitos = encontros_feitos;
		this.faltas = faltas;
	}

}
