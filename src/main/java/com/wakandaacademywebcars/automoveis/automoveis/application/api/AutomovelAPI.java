package com.wakandaacademywebcars.automoveis.automoveis.application.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import jakarta.validation.Valid;

@RequestMapping("v1/api/auto")
public interface AutomovelAPI {
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	AutomovelResponse postCadastraNovoAutomovel(@RequestBody @Valid  AutomovelRequest automovelRequest );

	@GetMapping
	@ResponseStatus(value = HttpStatus.OK)
	List<AutomovelListResponse> getListaTodosAutomoveis();
}
