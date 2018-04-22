package br.com.paulofernandes.custos.dtos;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

/**
 *
 * @author Paulo Fernandes
 *
 */
public class SimulacaoDTO implements Serializable {

	private static final long serialVersionUID = 5034390740968047093L;

	@NotNull
	private Long toneladas;
	@NotNull
	private Long veiculoSelecionado;
	@NotNull
	private Long distanciaPercorridaPavimentada;
	@NotNull
	private Long distanciaPercorridaNaoPavimentada;

	private BigDecimal custoFinal;

	public Long getToneladas() {
		return toneladas;
	}

	public void setToneladas(Long toneladas) {
		this.toneladas = toneladas;
	}

	public Long getVeiculoSelecionado() {
		return veiculoSelecionado;
	}

	public void setVeiculoSelecionado(Long veiculoSelecionado) {
		this.veiculoSelecionado = veiculoSelecionado;
	}

	public Long getDistanciaPercorridaPavimentada() {
		return distanciaPercorridaPavimentada;
	}

	public void setDistanciaPercorridaPavimentada(Long distanciaPercorridaPavimentada) {
		this.distanciaPercorridaPavimentada = distanciaPercorridaPavimentada;
	}

	public Long getDistanciaPercorridaNaoPavimentada() {
		return distanciaPercorridaNaoPavimentada;
	}

	public void setDistanciaPercorridaNaoPavimentada(Long distanciaPercorridaNaoPavimentada) {
		this.distanciaPercorridaNaoPavimentada = distanciaPercorridaNaoPavimentada;
	}

	public BigDecimal getCustoFinal() {
		return custoFinal;
	}

	public void setCustoFinal(BigDecimal custoFinal) {
		this.custoFinal = custoFinal;
	}

}
