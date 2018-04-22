package br.com.paulofernandes.custos.enums;

/**
 *
 * @author Paulo Fernandes
 *
 */
public enum ParametrosEnum {

	CARGA_EXCEDENTE_CUSTO("CARGA_EXCEDENTE_CUSTO"),
	CARGA_EXCEDENTE_LIMTE("CARGA_EXCEDENTE_LIMTE");

	private String nomeParametro;

	private ParametrosEnum(String nomeParametro) {
		this.nomeParametro = nomeParametro;
	}

	public String getNomeParametro() {
		return nomeParametro;
	}

}
