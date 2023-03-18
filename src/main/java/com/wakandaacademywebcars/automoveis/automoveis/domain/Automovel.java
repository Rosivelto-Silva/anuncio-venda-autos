package com.wakandaacademywebcars.automoveis.automoveis.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.wakandaacademywebcars.automoveis.automoveis.application.api.AutomovelRequest;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Automovel {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idAuto;
	@Enumerated(EnumType.STRING)
	private Marca marca;
	@Enumerated(EnumType.STRING)
	private Categoria tipo;
	@NotBlank
	private String descricaoTec;
	@NotNull
	private Double valor;
	private LocalDate dataVenda; 
	private LocalDateTime dataHoraDoCadstro; 
	
	public Automovel(AutomovelRequest automovelRequest) {
		this.marca = automovelRequest.getMarca();
		this.tipo = automovelRequest.getTipo();
		this.descricaoTec = automovelRequest.getDescricaoTec();
		this.valor = automovelRequest.getValor();
		this.dataHoraDoCadstro = LocalDateTime.now();
	}

	
}
