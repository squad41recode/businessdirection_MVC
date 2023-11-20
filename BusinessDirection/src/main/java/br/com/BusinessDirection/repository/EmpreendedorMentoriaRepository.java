package br.com.BusinessDirection.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.BusinessDirection.model.EmpreendedorMentoria;

public interface EmpreendedorMentoriaRepository extends JpaRepository<EmpreendedorMentoria, Long>{
   
    @EntityGraph(attributePaths = {"mentorModalidade","empreendedor"})
    List<EmpreendedorMentoria> findAll();
    

	/*
	 * @Query("select * from mentor_modalidade e where m.empreendedor.id not like fk_empreendedor_id;"
	 * ) List<EmpreendedorMentoria> listarMentoriasDisponiveisProEmpreendedor(Long
	 * id);
	 */
    
    
}
