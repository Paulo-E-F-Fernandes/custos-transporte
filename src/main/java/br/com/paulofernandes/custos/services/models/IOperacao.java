package br.com.paulofernandes.custos.services.models;

/**
 *
 * @author Paulo Fernandes
 *
 */
public interface IOperacao {

	void executar(Orcamento orcamento);

	void setProximo(IOperacao proximo);

}
