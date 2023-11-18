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
@Table(name = "MentorModalidade")
public class MentorModalidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMentorModalidade;
	
	@OneToOne
	@JoinColumn(name = "fk_Mentor_id")
	private Mentor idmentor;
	
	@OneToOne
	@JoinColumn(name = "fk_ModalidadeMentoria_id")
	private ModalidadeMentoria idmodalidadeMentoria;
	
	private String diaSemana;
	
	private String horario;
	
	

	public MentorModalidade(Long idMentorModalidade, Mentor idmentor, ModalidadeMentoria idmodalidadeMentoria,
			String diaSemana, String horario) {
		super();
		this.idMentorModalidade = idMentorModalidade;
		this.idmentor = idmentor;
		this.idmodalidadeMentoria = idmodalidadeMentoria;
		this.diaSemana = diaSemana;
		this.horario = horario;
	}

	public MentorModalidade(Mentor idmentor, ModalidadeMentoria idmodalidadeMentoria, String diaSemana,
			String horario) {
		super();
		this.idmentor = idmentor;
		this.idmodalidadeMentoria = idmodalidadeMentoria;
		this.diaSemana = diaSemana;
		this.horario = horario;
	}

	public Long getIdMentorModalidade() {
		return idMentorModalidade;
	}

	public void setIdMentorModalidade(Long idMentorModalidade) {
		this.idMentorModalidade = idMentorModalidade;
	}

	public Mentor getIdmentor() {
		return idmentor;
	}

	public void setIdmentor(Mentor idmentor) {
		this.idmentor = idmentor;
	}

	public ModalidadeMentoria getIdmodalidadeMentoria() {
		return idmodalidadeMentoria;
	}

	public void setIdmodalidadeMentoria(ModalidadeMentoria idmodalidadeMentoria) {
		this.idmodalidadeMentoria = idmodalidadeMentoria;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(diaSemana, horario, idMentorModalidade, idmentor, idmodalidadeMentoria);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MentorModalidade other = (MentorModalidade) obj;
		return Objects.equals(diaSemana, other.diaSemana) && Objects.equals(horario, other.horario)
				&& Objects.equals(idMentorModalidade, other.idMentorModalidade)
				&& Objects.equals(idmentor, other.idmentor)
				&& Objects.equals(idmodalidadeMentoria, other.idmodalidadeMentoria);
	}

	@Override
	public String toString() {
		return "MentorModalidade [idMentorModalidade=" + idMentorModalidade + ", idmentor=" + idmentor
				+ ", idmodalidadeMentoria=" + idmodalidadeMentoria + ", diaSemana=" + diaSemana + ", horario=" + horario
				+ "]";
	}
	
	

}
