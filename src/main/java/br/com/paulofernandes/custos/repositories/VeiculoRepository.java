package br.com.paulofernandes.custos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.paulofernandes.custos.models.Veiculo;

/**
 *
 * @author Paulo Fernandes
 *
 */
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

	public List<Veiculo> findAllByOrderByNomeAsc();

}
