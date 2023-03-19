package com.wakandaacademywebcars.automoveis.automoveis.application.repository;

import java.util.List;

import com.wakandaacademywebcars.automoveis.automoveis.domain.Automovel;

public interface AutomovelRepository {
	Automovel salva(Automovel automovel);
	List<Automovel> buscaTodosAutomoveis();
}
