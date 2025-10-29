package com.ironfit.ironfit.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ironfit.ironfit.modelo.RutinaEjercicio;
import com.ironfit.ironfit.modelo.RutinaEjercicioId;
import com.ironfit.ironfit.modelo.Rutina;
import com.ironfit.ironfit.modelo.Ejercicio;

import java.util.List;

@Repository
public interface RutinaEjercicioRepository extends JpaRepository<RutinaEjercicio, RutinaEjercicioId> {

    // Busca todos los ejercicios asociados a una rutina específica
    List<RutinaEjercicio> findByRutina(Rutina rutina);

    // Busca una combinación específica de rutina y ejercicio
    RutinaEjercicio findByRutinaAndEjercicio(Rutina rutina, Ejercicio ejercicio);
} 
