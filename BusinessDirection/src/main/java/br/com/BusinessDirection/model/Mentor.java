package br.com.BusinessDirection.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Mentor")
public class Mentor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMentor;

	private String nome;
	private String sobrenome;
	private String whatsapp;
	private String email;
	private String tipoExperiencia;
	private Date dataNascimento;

	public Mentor() {
		super();
	}

	public Mentor(Long idMentor, String nome, String sobrenome, String whatsapp, String email, String tipoExperiencia,
			Date dataNascimento) {
		super();
		this.idMentor = idMentor;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.whatsapp = whatsapp;
		this.email = email;
		this.tipoExperiencia = tipoExperiencia;
		this.dataNascimento = dataNascimento;
	}

	public Long getIdMentor() {
		return idMentor;
	}

	public void setIdMentor(Long idMentor) {
		this.idMentor = idMentor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTipoExperiencia() {
		return tipoExperiencia;
	}

	public void setTipoExperiencia(String tipoExperiencia) {
		this.tipoExperiencia = tipoExperiencia;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Mentor [idMentor=" + idMentor + ", nome=" + nome + ", sobrenome=" + sobrenome + ", whatsapp=" + whatsapp
				+ ", email=" + email + ", tipoExperiencia=" + tipoExperiencia + ", dataNascimento=" + dataNascimento
				+ "]";
	}

}
