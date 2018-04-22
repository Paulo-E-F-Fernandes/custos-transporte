package br.com.paulofernandes.custos.services.models;

import java.math.RoundingMode;

import br.com.paulofernandes.custos.services.designpatterns.CustoTemplateMethod;

/**
 *
 * @author Paulo Fernandes
 *
 */
public class CustoMultiplicadorVeiculo extends CustoTemplateMethod {

	@Override
	protected void calcularCusto(Orcamento orcamento) {
		orcamento.setCustoTotal(orcamento.getCustoTotal().multiply(orcamento.getVeiculoUtilizado().getFator(), mc).setScale(2, RoundingMode.HALF_UP));
	}

}
