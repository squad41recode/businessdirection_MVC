package br.com.BusinessDirection.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.BusinessDirection.model.MentorModalidade;

public interface MentorModalidadeRepository extends JpaRepository<MentorModalidade, Long> {

	@EntityGraph(attributePaths = { "mentor", "modalidadeMentoria" })
	List<MentorModalidade> findAll();
}
