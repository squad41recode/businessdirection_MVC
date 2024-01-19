package br.com.BusinessDirection.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.BusinessDirection.model.Empreendedor;

public interface EmpreendedorRepository extends JpaRepository<Empreendedor, Long> {

	@EntityGraph(attributePaths = { "mentoriasAdquiridas" })
	List<Empreendedor> findAll();//, "conteudosEstudados"

}
