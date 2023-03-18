package com.wakandaacademywebcars.automoveis.automoveis.application.service;

import org.springframework.stereotype.Service;

import com.wakandaacademywebcars.automoveis.automoveis.application.repository.AutomovelRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
@Service
public class AutomovelApplicationService implements AutomovelService {
	private final AutomovelRepository autoRepository ; 

}
