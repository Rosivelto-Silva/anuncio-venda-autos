package com.wakandaacademywebcars.automoveis.automoveis.application.infra;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.wakandaacademywebcars.automoveis.automoveis.application.repository.AutomovelRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
@Repository
public class AutomovelInfraRepository implements AutomovelRepository {
	private final springDataJPARepository jpaRepository;
}
