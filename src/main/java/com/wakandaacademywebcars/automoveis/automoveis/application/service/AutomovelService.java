package com.wakandaacademywebcars.automoveis.automoveis.application.service;

import java.util.List;

import com.wakandaacademywebcars.automoveis.automoveis.application.api.AutomovelListResponse;
import com.wakandaacademywebcars.automoveis.automoveis.application.api.AutomovelRequest;
import com.wakandaacademywebcars.automoveis.automoveis.application.api.AutomovelResponse;

public interface AutomovelService {
	AutomovelResponse cadastraNovoVeiculo(AutomovelRequest automovelRequest);
	List<AutomovelListResponse> listaTodosAutomoveis();
}
