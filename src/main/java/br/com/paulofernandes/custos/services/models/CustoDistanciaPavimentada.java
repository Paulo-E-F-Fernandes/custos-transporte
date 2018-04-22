package br.com.paulofernandes.custos.services.models;

import java.math.BigDecimal;

import br.com.paulofernandes.custos.services.designpatterns.CustoTemplateMethod;

/**
 *
 * @author Paulo Fernandes
 *
 */
public class CustoDistanciaPavimentada extends CustoTemplateMethod {

	@Override
	protected void calcularCusto(Orcamento orcamento) {
		if (!BigDecimal.ZERO.equals(orcamento.getDistanciaPavimentada().getDistanciaPercorrida())) {
			BigDecimal custoTrecoPavimentado = orcamento.getDistanciaPavimentada().getDistanciaPercorrida()
					.multiply(orcamento.getDistanciaPavimentada().getTipoRodovia().getCustoKm(), mc);

			orcamento.setCustoTotal(orcamento.getCustoTotal().add(custoTrecoPavimentado, mc));
		}
	}

}
