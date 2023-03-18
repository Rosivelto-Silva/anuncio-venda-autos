package com.wakandaacademywebcars.automoveis.automoveis.infra;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wakandaacademywebcars.automoveis.automoveis.domain.Automovel;

public interface springDataJPARepository extends JpaRepository<Automovel, Long> {

}
