package com.wakandaacademywebcars.automoveis.automoveis.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wakandaacademywebcars.automoveis.automoveis.application.api.AutomovelListResponse;
import com.wakandaacademywebcars.automoveis.automoveis.application.api.AutomovelRequest;
import com.wakandaacademywebcars.automoveis.automoveis.application.api.AutomovelResponse;
import com.wakandaacademywebcars.automoveis.automoveis.application.repository.AutomovelRepository;
import com.wakandaacademywebcars.automoveis.automoveis.domain.Automovel;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
@Service
public class AutomovelApplicationService implements AutomovelService {
	private final AutomovelRepository autoRepository ;

	@Override
	public AutomovelResponse cadastraNovoVeiculo(AutomovelRequest automovelRequest) {
		log.info("[inicia] AutomovelApplicationService - cadastraNovoVeiculo");
		Automovel auto =autoRepository.salva(new Automovel(automovelRequest));
		log.info("[finaliza] AutomovelApplicationService - cadastraNovoVeiculo");
		return AutomovelResponse.builder().idAuto(auto.getIdAuto()).build();
	}

	@Override
	public List<AutomovelListResponse> listaTodosAutomoveis() {
		log.info("[inicia] AutomovelApplicationService - listaTodosAutomoveis");
		List<Automovel> auto = autoRepository.buscaTodosAutomoveis();
		log.info("[finaliza] AutomovelApplicationService - listaTodosAutomoveis");
		return  AutomovelListResponse.converte(auto);
	} 

}
