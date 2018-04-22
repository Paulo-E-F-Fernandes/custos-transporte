package br.com.paulofernandes.custos.services.designpatterns;

import java.math.MathContext;
import java.math.RoundingMode;

import br.com.paulofernandes.custos.services.models.IOperacao;
import br.com.paulofernandes.custos.services.models.Orcamento;

/**
 *
 * @author Paulo Fernandes
 *
 */
public abstract class CustoTemplateMethod implements IOperacao {

	protected final MathContext mc = new MathContext(10, RoundingMode.HALF_UP);
	protected IOperacao proximo;

	protected abstract void calcularCusto(Orcamento orcamento);

	@Override
	public void executar(Orcamento orcamento) {
		calcularCusto(orcamento);
		proximo.executar(orcamento);
	}

	@Override
	public void setProximo(IOperacao proximo) {
		this.proximo = proximo;
	}

}
