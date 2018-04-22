package br.com.paulofernandes.custos.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.paulofernandes.custos.dtos.VeiculoDTO;
import br.com.paulofernandes.custos.models.Veiculo;
import br.com.paulofernandes.custos.repositories.VeiculoRepository;

/**
 *
 * @author Paulo Fernandes
 *
 */
@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository veiculoRepository;

	public List<VeiculoDTO> getListCombo() {
		List<Veiculo> veiculos = veiculoRepository.findAllByOrderByNomeAsc();
		List<VeiculoDTO> veiculosDTO = new ArrayList<>();
		for (Veiculo veiculo : veiculos) {
			VeiculoDTO veiculoDTO = new VeiculoDTO();
			BeanUtils.copyProperties(veiculo, veiculoDTO);
			veiculosDTO.add(veiculoDTO);
		}

		return veiculosDTO;
	}

	public void adicionar(VeiculoDTO veiculoDTO) {
		Veiculo veiculo = new Veiculo();

		veiculo.setNome(veiculoDTO.getNome());
		veiculo.setFator(veiculoDTO.getFator());

		veiculoRepository.save(veiculo);
	}

}
