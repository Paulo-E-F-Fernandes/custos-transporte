package br.com.paulofernandes.custos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.paulofernandes.custos.models.Parametro;

/**
 *
 * @author Paulo Fernandes
 *
 */
public interface ParametroRepository extends JpaRepository<Parametro, Long> {

	@Query("select p.valor from Parametro p where p.nome = :nome")
	public String findValorByNome(@Param("nome") String nome);

}
