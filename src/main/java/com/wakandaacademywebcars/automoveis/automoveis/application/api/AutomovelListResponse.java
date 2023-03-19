package com.wakandaacademywebcars.automoveis.automoveis.application.api;

import java.util.List;
import java.util.stream.Collectors;

import com.wakandaacademywebcars.automoveis.automoveis.domain.Automovel;
import com.wakandaacademywebcars.automoveis.automoveis.domain.Categoria;
import com.wakandaacademywebcars.automoveis.automoveis.domain.Marca;

import lombok.Getter;

@Getter
public class AutomovelListResponse {

	private Long idAuto;
	private Marca marca;
	private Categoria categoria;
	public static List<AutomovelListResponse> converte(List<Automovel> auto) {
		return auto.stream().map(AutomovelListResponse::new).collect(Collectors.toList());
	}
	public AutomovelListResponse(Automovel auto) {
		this.idAuto = auto.getIdAuto();
		this.marca = auto.getMarca();
		this.categoria = auto.getCategoria();
	}
	
	
}
