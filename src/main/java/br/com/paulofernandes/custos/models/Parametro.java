package br.com.paulofernandes.custos.models;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Paulo Fernandes
 *
 */
@Entity
public class Parametro extends BaseEntity {

	private static final long serialVersionUID = 6151078514204679310L;

	@Column(nullable = false, length = 64)
	private String valor;

	@Column(length = 128)
	private String descricao;

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

}
