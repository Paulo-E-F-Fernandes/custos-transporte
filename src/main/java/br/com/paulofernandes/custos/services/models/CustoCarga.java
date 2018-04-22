package br.com.paulofernandes.custos.services.models;

import java.math.BigDecimal;

import br.com.paulofernandes.custos.enums.ParametrosEnum;
import br.com.paulofernandes.custos.repositories.ParametroRepository;
import br.com.paulofernandes.custos.services.designpatterns.CustoTemplateMethod;

/**
 *
 * @author Paulo Fernandes
 *
 */
public class CustoCarga extends CustoTemplateMethod {

	private ParametroRepository parametroRepository;

	public CustoCarga(ParametroRepository parametroRepository) {
		this.parametroRepository = parametroRepository;
	}

	@Override
	protected void calcularCusto(Orcamento orcamento) {
		BigDecimal pesoCargaLimite = new BigDecimal(parametroRepository.findValorByNome(ParametrosEnum.CARGA_EXCEDENTE_LIMTE.getNomeParametro()));
		BigDecimal pesoCarga = BigDecimal.valueOf(orcamento.getPesoCarga());

		if (pesoCarga.compareTo(pesoCargaLimite) > 0) {
			String custoCargaExcedente = parametroRepository.findValorByNome(ParametrosEnum.CARGA_EXCEDENTE_CUSTO.getNomeParametro());
			BigDecimal pesoExcedente = pesoCarga.subtract(pesoCargaLimite, mc);
			BigDecimal custoPeso = pesoExcedente.multiply(new BigDecimal(custoCargaExcedente), mc);
			BigDecimal kmTotal = orcamento.getDistanciaPavimentada().getDistanciaPercorrida()
					.add(orcamento.getDistanciaNaoPavimentada().getDistanciaPercorrida(), mc);

			orcamento.setCustoTotal(orcamento.getCustoTotal().add(custoPeso.multiply(kmTotal, mc)));
		}

	}

}
