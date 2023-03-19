package com.wakandaacademywebcars.automoveis.automoveis.application.api;

import java.util.List;

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

	@Override
	public List<AutomovelListResponse> getListaTodosAutomoveis() {
		log.info("[inicia] AutomovelRestController - getListaTodosAutomoveis");
		List<AutomovelListResponse> listaAutos = autoService.listaTodosAutomoveis();
		log.info("[finaliza] AutomovelRestController - getListaTodosAutomoveis");
		return listaAutos;
	} 
}
