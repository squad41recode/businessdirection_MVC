package br.com.BusinessDirection.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ConteudoEmpreendedor")
public class ConteudoEmpreendedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idConteudoEmpreendedor;

	@ManyToOne
	@JoinColumn(name = "fk_ConteudoOnline_id")//, nullable = false
	private ConteudoOnline conteudoOnline;
 
	@ManyToOne
	@JoinColumn(name = "fk_empreendedor_id")//, nullable = false
	private Empreendedor empreendedor;

	private String status;
	private Date dataInicio;
	private Date dataFim;

	public ConteudoEmpreendedor() {
		super();
	}

	public ConteudoEmpreendedor(Long idConteudoEmpreendedor, ConteudoOnline conteudoOnline, Empreendedor empreendedor,
			String status, Date dataInicio, Date dataFim) {
		super();
		this.idConteudoEmpreendedor = idConteudoEmpreendedor;
		this.conteudoOnline = conteudoOnline;
		this.empreendedor = empreendedor;
		this.status = status;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public Long getIdConteudoEmpreendedor() {
		return idConteudoEmpreendedor;
	}

	public void setIdConteudoEmpreendedor(Long idConteudoEmpreendedor) {
		this.idConteudoEmpreendedor = idConteudoEmpreendedor;
	}

	public ConteudoOnline getConteudoOnline() {
		return conteudoOnline;
	}

	public void setConteudoOnline(ConteudoOnline conteudoOnline) {
		this.conteudoOnline = conteudoOnline;
	}

	public Empreendedor getEmpreendedor() {
		return empreendedor;
	}

	public void setEmpreendedor(Empreendedor empreendedor) {
		this.empreendedor = empreendedor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	@Override
	public String toString() {
		return "ConteudoEmpreendedor [idConteudoEmpreendedor=" + idConteudoEmpreendedor + ", conteudoOnline="
				+ conteudoOnline + ", empreendedor=" + empreendedor + ", status=" + status + ", dataInicio="
				+ dataInicio + ", dataFim=" + dataFim + "]";
	}

}