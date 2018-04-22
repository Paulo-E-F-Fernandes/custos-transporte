package br.com.paulofernandes.custos.dtos;

import java.io.Serializable;

/**
 *
 * @author Paulo Fernandes
 *
 */
public class VeiculoDTO implements Serializable {

	private static final long serialVersionUID = 1206311557511632366L;

	private Long id;
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
