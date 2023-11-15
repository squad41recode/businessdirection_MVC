/*
 * package br.com.BusinessDirection.model;
 * 
 * import java.util.List;
 * 
 * import jakarta.persistence.Entity; import jakarta.persistence.GeneratedValue;
 * import jakarta.persistence.GenerationType; import jakarta.persistence.Id;
 * import jakarta.persistence.JoinColumn; import jakarta.persistence.OneToMany;
 * import jakarta.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name = "FilaEspera") public class FilaEspera {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long
 * idFilaEspera;
 * 
 * ///////RELACIONAMENTOS ERRADOS
 * 
 * @OneToMany//(mappedBy = "ModalidadeMentoria")
 * 
 * @JoinColumn(name = "fk_FilaEspera_id", nullable = false) private
 * List<ModalidadeMentoria> modalidadesMentorias;
 * 
 * @OneToMany//(mappedBy = "Empreendedor")
 * 
 * @JoinColumn(name = "fk_FilaEspera_id", nullable = false) private
 * List<Empreendedor> empreendedores;
 * 
 * 
 * Example 3: Unidirectional One-to-Many association using a foreign key mapping
 * 
 * // In Customer class:
 * 
 * @OneToMany(orphanRemoval=true)
 * 
 * @JoinColumn(name="CUST_ID") // join column is in table for Order public
 * Set<Order> getOrders() {return orders;}
 * 
 * 
 * private int posicao;
 * 
 * public FilaEspera() { super(); }
 * 
 * public FilaEspera(Long idFilaEspera, List<ModalidadeMentoria>
 * modalidadesMentorias, List<Empreendedor> empreendedores, int posicao) {
 * super(); this.idFilaEspera = idFilaEspera; this.modalidadesMentorias =
 * modalidadesMentorias; this.empreendedores = empreendedores; this.posicao =
 * posicao; }
 * 
 * public Long getIdFilaEspera() { return idFilaEspera; }
 * 
 * public void setIdFilaEspera(Long idFilaEspera) { this.idFilaEspera =
 * idFilaEspera; }
 * 
 * public List<ModalidadeMentoria> getModalidadesMentorias() { return
 * modalidadesMentorias; }
 * 
 * public void setModalidadesMentorias(List<ModalidadeMentoria>
 * modalidadesMentorias) { this.modalidadesMentorias = modalidadesMentorias; }
 * 
 * public List<Empreendedor> getEmpreendedores() { return empreendedores; }
 * 
 * public void setEmpreendedores(List<Empreendedor> empreendedores) {
 * this.empreendedores = empreendedores; }
 * 
 * public int getPosicao() { return posicao; }
 * 
 * public void setPosicao(int posicao) { this.posicao = posicao; }
 * 
 * 
 * 
 * }
 */
