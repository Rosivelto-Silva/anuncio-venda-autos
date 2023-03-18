package com.wakandaacademywebcars.automoveis.automoveis.application.api;

import java.time.LocalDate;

import com.wakandaacademywebcars.automoveis.automoveis.domain.Categoria;
import com.wakandaacademywebcars.automoveis.automoveis.domain.Marca;

import lombok.Getter;

@Getter
public class AutomovelRequest {
	private Marca marca;
	private Categoria tipo;
	private String descricaoTec;
	private Double valor;
	private LocalDate dataVenda; 

}
