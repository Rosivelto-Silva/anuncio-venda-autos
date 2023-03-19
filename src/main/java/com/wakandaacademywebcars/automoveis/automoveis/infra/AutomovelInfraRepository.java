package com.wakandaacademywebcars.automoveis.automoveis.infra;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wakandaacademywebcars.automoveis.automoveis.application.repository.AutomovelRepository;
import com.wakandaacademywebcars.automoveis.automoveis.domain.Automovel;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
@Repository
public class AutomovelInfraRepository implements AutomovelRepository {
	private final springDataJPARepository jpaRepository;

	@Override
	public Automovel salva(Automovel automovel) {
		log.info("[inicia] AutomovelInfraRepository - salva");
		var salvaAuto = jpaRepository.save(automovel); 
		log.info("[finaliza] AutomovelInfraRepository - salva");
		return salvaAuto;
	}

	@Override
	public List<Automovel> buscaTodosAutomoveis() {
		log.info("[inicia] AutomovelInfraRepository - buscaTodosAutomoveis");
		var busca = jpaRepository.findAll();
		log.info("[finaliza] AutomovelInfraRepository - buscaTodosAutomoveis");
		return busca;
	}
}
