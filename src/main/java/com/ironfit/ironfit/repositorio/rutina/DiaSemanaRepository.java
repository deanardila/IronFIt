package com.ironfit.ironfit.repositorio.rutina;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ironfit.ironfit.modelo.rutina.DiaSemana;


@Repository
public interface DiaSemanaRepository extends JpaRepository<DiaSemana, Byte> {
}
