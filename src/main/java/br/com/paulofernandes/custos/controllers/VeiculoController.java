package br.com.paulofernandes.custos.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.paulofernandes.custos.dtos.SimulacaoDTO;
import br.com.paulofernandes.custos.dtos.VeiculoDTO;
import br.com.paulofernandes.custos.services.VeiculoService;

/**
 *
 * @author Paulo Fernandes
 *
 */
@Controller
public class VeiculoController {

	@Autowired
	private VeiculoService veiculoService;

	@PostMapping("/veiculo")
	public ModelAndView adicionar(SimulacaoDTO simulacaoDTO, @Valid VeiculoDTO veiculoDTO, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			//
		}
		veiculoService.adicionar(veiculoDTO);
		redirect.addFlashAttribute("mensagemSucesso", "message.veiculo.adicionado");
		redirect.addFlashAttribute(simulacaoDTO);

		return new ModelAndView("redirect:/simulacao");
	}

}
