package br.com.paulofernandes.custos.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Paulo Fernandes
 *
 */
@Entity(name = "veiculo")
public class Veiculo extends BaseEntity {

	private static final long serialVersionUID = 2306239321855971472L;

	@Column(name = "fator_multiplicador", nullable = false, precision = 8, scale = 2)
	private BigDecimal fator;

	public BigDecimal getFator() {
		return fator;
	}

	public void setFator(BigDecimal fator) {
		this.fator = fator;
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
