package br.com.paulofernandes.custos.dtos;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.NumberFormat;

/**
 *
 * @author Paulo Fernandes
 *
 */
public class VeiculoDTO implements Serializable {

	private static final long serialVersionUID = 9122598934060532146L;

	private Long id;
	@NotBlank
	private String nome;
	@NotNull
	@NumberFormat(pattern = "#,##0.00")
	private BigDecimal fator;

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

	public BigDecimal getFator() {
		return fator;
	}

	public void setFator(BigDecimal fator) {
		this.fator = fator;
	}

}
