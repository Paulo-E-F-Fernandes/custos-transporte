package br.com.paulofernandes.custos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.paulofernandes.custos.models.TipoRodovia;

/**
 *
 * @author Paulo Fernandes
 *
 */
public interface TipoRodoviaRepository extends JpaRepository<TipoRodovia, Long> {

	public TipoRodovia findByCodigo(String codigo);

}
