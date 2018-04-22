package br.com.paulofernandes.custos.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.paulofernandes.custos.dtos.SimulacaoDTO;
import br.com.paulofernandes.custos.dtos.VeiculoDTO;
import br.com.paulofernandes.custos.services.SimuladorService;
import br.com.paulofernandes.custos.services.VeiculoService;

/**
 *
 * @author Paulo Fernandes
 *
 */
@Controller
public class SimulacaoController {

	@Autowired
	private VeiculoService veiculoService;

	@Autowired
	private SimuladorService simulacaoService;

	@GetMapping("/simulacao")
	public ModelAndView simulacao(SimulacaoDTO simulacaoDTO, VeiculoDTO veiculoDTO) {
		ModelAndView mv = new ModelAndView("custos/simulacao");
		mv.addObject("veiculos", veiculoService.getListCombo());
		return mv;
	}

	@PostMapping("/simulacao")
	public ModelAndView simular(@Valid SimulacaoDTO simulacaoDTO, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return simulacao(simulacaoDTO, new VeiculoDTO());
		}

		simulacaoService.simular(simulacaoDTO);

		redirect.addFlashAttribute("mensagemSucesso", "message.simulacao.sucesso");
		redirect.addFlashAttribute("custoFinal", simulacaoDTO.getCustoFinal());
		return new ModelAndView("redirect:/simulacao");
	}

}
