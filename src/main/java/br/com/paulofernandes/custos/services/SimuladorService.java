package br.com.paulofernandes.custos.services;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.paulofernandes.custos.dtos.SimulacaoDTO;
import br.com.paulofernandes.custos.models.Veiculo;
import br.com.paulofernandes.custos.repositories.ParametroRepository;
import br.com.paulofernandes.custos.repositories.TipoRodoviaRepository;
import br.com.paulofernandes.custos.repositories.VeiculoRepository;
import br.com.paulofernandes.custos.services.designpatterns.ChainOfResponsibility;
import br.com.paulofernandes.custos.services.models.Distancia;
import br.com.paulofernandes.custos.services.models.Orcamento;

/**
 *
 * @author Paulo Fernandes
 *
 */
@Service
public class SimuladorService {

	@Autowired
	private TipoRodoviaRepository tipoRodoviaRepository;

	@Autowired
	private VeiculoRepository veiculoRepository;

	@Autowired
	private ParametroRepository parametroRepository;

	public void simular(SimulacaoDTO simulacao) {
		ChainOfResponsibility chainOfResponsibility = new ChainOfResponsibility(parametroRepository);

		BigDecimal distanciaPavimentada = BigDecimal.valueOf(simulacao.getDistanciaPercorridaPavimentada());
		BigDecimal distanciaNaoPavimentada = BigDecimal.valueOf(simulacao.getDistanciaPercorridaNaoPavimentada());

		Orcamento orcamento = new Orcamento();
		orcamento.setPesoCarga(simulacao.getToneladas());
		orcamento.setDistanciaPavimentada(new Distancia(distanciaPavimentada, tipoRodoviaRepository.findByCodigo("P")));
		orcamento.setDistanciaNaoPavimentada(new Distancia(distanciaNaoPavimentada, tipoRodoviaRepository.findByCodigo("N")));

		Optional<Veiculo> optionalVeiculo = veiculoRepository.findById(simulacao.getVeiculoSelecionado());
		if (optionalVeiculo.isPresent()) {
			orcamento.setVeiculoUtilizado(optionalVeiculo.get());
		}

		// Executar a cadeia de responsabilidades
		chainOfResponsibility.executar(orcamento);
		simulacao.setCustoFinal(orcamento.getCustoTotal());
	}

}
