package br.com.paulofernandes.custos.services.models;

import java.math.BigDecimal;

import br.com.paulofernandes.custos.services.designpatterns.CustoTemplateMethod;

/**
 *
 * @author Paulo Fernandes
 *
 */
public class CustoDistanciaNaoPavimentada extends CustoTemplateMethod {

	@Override
	public void calcularCusto(Orcamento orcamento) {
		if (!BigDecimal.ZERO.equals(orcamento.getDistanciaNaoPavimentada().getDistanciaPercorrida())) {
			BigDecimal custoTrecoNaoPavimentado = orcamento.getDistanciaNaoPavimentada().getDistanciaPercorrida()
					.multiply(orcamento.getDistanciaNaoPavimentada().getTipoRodovia().getCustoKm(), mc);

			orcamento.setCustoTotal(orcamento.getCustoTotal().add(custoTrecoNaoPavimentado, mc));
		}
	}

}
