package br.com.BusinessDirection.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "EmpreendedorMentoria")
public class EmpreendedorMentoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmpreendedorMentoria;
	
	@OneToMany
	@JoinColumn(name = "fk_MentorModalidade_id")
	private MentorModalidade idMentorModalidade;
	
	@OneToMany
	@JoinColumn(name = "fk_Empreendedor_id")
	private Empreendedor idEmpreendedor;
	
	private String statua;
	private int encontros_feitos;
	private int faltas;
	public Long getIdEmpreendedorMentoria() {
		return idEmpreendedorMentoria;
	}
	public void setIdEmpreendedorMentoria(Long idEmpreendedorMentoria) {
		this.idEmpreendedorMentoria = idEmpreendedorMentoria;
	}

	public MentorModalidade getIdMentorModalidade() {
		return idMentorModalidade;
	}
	public void setIdMentorModalidade(MentorModalidade idMentorModalidade) {
		this.idMentorModalidade = idMentorModalidade;
	}
	public Empreendedor getIdEmpreendedor() {
		return idEmpreendedor;
	}
	public void setIdEmpreendedor(Empreendedor idEmpreendedor) {
		this.idEmpreendedor = idEmpreendedor;
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
		return Objects.hash(encontros_feitos, faltas, idEmpreendedor, idEmpreendedorMentoria, idMentorModalidade,
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
				&& Objects.equals(idEmpreendedor, other.idEmpreendedor)
				&& Objects.equals(idEmpreendedorMentoria, other.idEmpreendedorMentoria)
				&& Objects.equals(idMentorModalidade, other.idMentorModalidade) && Objects.equals(statua, other.statua);
	}
	@Override
	public String toString() {
		return "EmpreendedorMentoria [idEmpreendedorMentoria=" + idEmpreendedorMentoria + ", idMentorModalidade="
				+ idMentorModalidade + ", idEmpreendedor=" + idEmpreendedor + ", statua=" + statua
				+ ", encontros_feitos=" + encontros_feitos + ", faltas=" + faltas + "]";
	}
	public EmpreendedorMentoria(Long idEmpreendedorMentoria, MentorModalidade idMentorModalidade,
			Empreendedor idEmpreendedor, String statua, int encontros_feitos, int faltas) {
		super();
		this.idEmpreendedorMentoria = idEmpreendedorMentoria;
		this.idMentorModalidade = idMentorModalidade;
		this.idEmpreendedor = idEmpreendedor;
		this.statua = statua;
		this.encontros_feitos = encontros_feitos;
		this.faltas = faltas;
	}
	public EmpreendedorMentoria(MentorModalidade idMentorModalidade, Empreendedor idEmpreendedor, String statua,
			int encontros_feitos, int faltas) {
		super();
		this.idMentorModalidade = idMentorModalidade;
		this.idEmpreendedor = idEmpreendedor;
		this.statua = statua;
		this.encontros_feitos = encontros_feitos;
		this.faltas = faltas;
	}

	
	
}
