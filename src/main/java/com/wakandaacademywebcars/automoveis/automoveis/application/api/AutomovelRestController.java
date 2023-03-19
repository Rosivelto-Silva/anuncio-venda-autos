package com.wakandaacademywebcars.automoveis.automoveis.application.api;

import org.springframework.web.bind.annotation.RestController;

import com.wakandaacademywebcars.automoveis.automoveis.application.service.AutomovelService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
@RestController
public class AutomovelRestController implements AutomovelAPI {
	private final AutomovelService autoService;

	@Override
	public AutomovelResponse postCadastraNovoAutomovel( AutomovelRequest automovelRequest) {
		log.info("[inicia] AutomovelRestController - postCadastraNovoAutomovel");
		AutomovelResponse auto = autoService.cadastraNovoVeiculo(automovelRequest);
		log.info("[finaliza] AutomovelRestController - postCadastraNovoAutomovel");
		return auto;
	} 
}
