package com.ironfit.ironfit.repositorio.rutina;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ironfit.ironfit.modelo.rutina.Ejercicio;
import com.ironfit.ironfit.modelo.rutina.Rutina;
import com.ironfit.ironfit.modelo.rutina.RutinaEjercicio;
import com.ironfit.ironfit.modelo.rutina.RutinaEjercicioId;

import java.util.List;

@Repository
public interface RutinaEjercicioRepository extends JpaRepository<RutinaEjercicio, RutinaEjercicioId> {

    // Busca todos los ejercicios asociados a una rutina específica
    List<RutinaEjercicio> findByRutina(Rutina rutina);

    // Busca una combinación específica de rutina y ejercicio
    RutinaEjercicio findByRutinaAndEjercicio(Rutina rutina, Ejercicio ejercicio);
} 
