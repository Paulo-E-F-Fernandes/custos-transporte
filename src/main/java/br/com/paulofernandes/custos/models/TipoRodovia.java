package br.com.paulofernandes.custos.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author Paulo Fernandes
 *
 */
@Entity(name = "tipo_rodovia")
public class TipoRodovia extends BaseEntity {

	private static final long serialVersionUID = 3902367596994686141L;

	@Column(nullable = false, length = 1)
	private String codigo;

	@Column(name = "custo_km", nullable = false, precision = 8, scale = 2)
	private BigDecimal custoKm;

	public BigDecimal getCustoKm() {
		return custoKm;
	}

	public void setCustoKm(BigDecimal custoKm) {
		this.custoKm = custoKm;
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
