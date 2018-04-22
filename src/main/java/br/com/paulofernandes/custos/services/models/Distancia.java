package br.com.paulofernandes.custos.services.models;

import java.math.BigDecimal;

import br.com.paulofernandes.custos.models.TipoRodovia;

public class Distancia {

	private BigDecimal distanciaPercorrida;
	private TipoRodovia tipoRodovia;

	public Distancia(BigDecimal distanciaPercorrida, TipoRodovia tipoRodovia) {
		this.distanciaPercorrida = distanciaPercorrida;
		this.tipoRodovia = tipoRodovia;
	}

	public BigDecimal getDistanciaPercorrida() {
		return distanciaPercorrida;
	}

	public TipoRodovia getTipoRodovia() {
		return tipoRodovia;
	}

}
