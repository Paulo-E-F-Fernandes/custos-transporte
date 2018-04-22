package br.com.paulofernandes.custos.services.models;

/**
 *
 * @author Paulo Fernandes
 *
 */
public class FinalizaProcessamento implements IOperacao {

	@Override
	public void executar(Orcamento orcamento) {
		// Não realiza processamento, desta forma o fluxo é finalizado!
	}

	@Override
	public void setProximo(IOperacao proximo) {
		// Não possui próximo!
	}

}
