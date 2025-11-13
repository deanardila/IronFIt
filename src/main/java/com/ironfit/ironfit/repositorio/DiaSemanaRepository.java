package com.ironfit.ironfit.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ironfit.ironfit.modelo.DiaSemana;


@Repository
public interface DiaSemanaRepository extends JpaRepository<DiaSemana, Byte> {
}
