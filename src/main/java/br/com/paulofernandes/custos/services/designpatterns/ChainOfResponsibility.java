package br.com.paulofernandes.custos.services.designpatterns;

import br.com.paulofernandes.custos.repositories.ParametroRepository;
import br.com.paulofernandes.custos.services.models.CustoCarga;
import br.com.paulofernandes.custos.services.models.CustoDistanciaNaoPavimentada;
import br.com.paulofernandes.custos.services.models.CustoDistanciaPavimentada;
import br.com.paulofernandes.custos.services.models.CustoMultiplicadorVeiculo;
import br.com.paulofernandes.custos.services.models.FinalizaProcessamento;
import br.com.paulofernandes.custos.services.models.IOperacao;
import br.com.paulofernandes.custos.services.models.Orcamento;

/**
 *
 * @author Paulo Fernandes
 *
 */
public class ChainOfResponsibility {

	private ParametroRepository parametroRepository;

	public ChainOfResponsibility(ParametroRepository parametroRepository) {
		this.parametroRepository = parametroRepository;
	}

	public void executar(Orcamento orcamento) {
		/* Inicializa os passos! */
		// 1o passo = calcular distância pavimentada
		IOperacao calcularDistanciaPavimentada = new CustoDistanciaPavimentada();
		// 2o passo = calcular distância não pavimentada
		IOperacao calcularDistanciaNaoPavimentada = new CustoDistanciaNaoPavimentada();
		// 3o passo = aplicar multiplicador de custo do veículo
		IOperacao calcularMultiplicadorVeiculo = new CustoMultiplicadorVeiculo();
		// 4o passo = calcular fator da carga
		IOperacao calcularCustoCarga = new CustoCarga(parametroRepository);

		// Último passo para finalizar o processamento
		IOperacao finalizarProcessamento = new FinalizaProcessamento();

		/* Atribuir os próximos */
		calcularDistanciaPavimentada.setProximo(calcularDistanciaNaoPavimentada);
		calcularDistanciaNaoPavimentada.setProximo(calcularMultiplicadorVeiculo);
		calcularMultiplicadorVeiculo.setProximo(calcularCustoCarga);
		calcularCustoCarga.setProximo(finalizarProcessamento);

		calcularDistanciaPavimentada.executar(orcamento);
	}

}
