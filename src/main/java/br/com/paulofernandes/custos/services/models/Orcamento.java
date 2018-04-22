package br.com.paulofernandes.custos.services.models;

import java.math.BigDecimal;

import br.com.paulofernandes.custos.models.Veiculo;

public class Orcamento {

	private Distancia distanciaPavimentada;
	private Distancia distanciaNaoPavimentada;
	private Veiculo veiculoUtilizado;
	private Long pesoCarga;
	private BigDecimal custoTotal;

	public Orcamento() {
		custoTotal = BigDecimal.ZERO;
	}

	public Distancia getDistanciaPavimentada() {
		return distanciaPavimentada;
	}

	public void setDistanciaPavimentada(Distancia distanciaPavimentada) {
		this.distanciaPavimentada = distanciaPavimentada;
	}

	public Distancia getDistanciaNaoPavimentada() {
		return distanciaNaoPavimentada;
	}

	public void setDistanciaNaoPavimentada(Distancia distanciaNaoPavimentada) {
		this.distanciaNaoPavimentada = distanciaNaoPavimentada;
	}

	public Veiculo getVeiculoUtilizado() {
		return veiculoUtilizado;
	}

	public void setVeiculoUtilizado(Veiculo veiculoUtilizado) {
		this.veiculoUtilizado = veiculoUtilizado;
	}

	public Long getPesoCarga() {
		return pesoCarga;
	}

	public void setPesoCarga(Long pesoCarga) {
		this.pesoCarga = pesoCarga;
	}

	public BigDecimal getCustoTotal() {
		return custoTotal;
	}

	public void setCustoTotal(BigDecimal custoTotal) {
		this.custoTotal = custoTotal;
	}

}
