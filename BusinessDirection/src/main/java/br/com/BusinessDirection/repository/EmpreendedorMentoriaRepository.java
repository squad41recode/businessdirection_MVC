package br.com.BusinessDirection.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.BusinessDirection.model.EmpreendedorMentoria;
import br.com.projetos.entidades.Funcionario;

public interface EmpreendedorMentoriaRepository extends JpaRepository<EmpreendedorMentoria, Long>{
   
    @EntityGraph(attributePaths = {"mentorModalidade","empreendedor"})
    List<EmpreendedorMentoria> findAll();
    

	/*
	 * @Query("select * from mentor_modalidade e where m.empreendedor.id not like fk_empreendedor_id;"
	 * ) List<EmpreendedorMentoria> listarMentoriasDisponiveisProEmpreendedor(Long
	 * id);
	 */
    
    
}
