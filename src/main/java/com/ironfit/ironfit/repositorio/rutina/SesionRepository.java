package com.ironfit.ironfit.repositorio.rutina;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ironfit.ironfit.modelo.rutina.Rutina;
import com.ironfit.ironfit.modelo.rutina.Sesion;

import java.util.List;

@Repository
public interface SesionRepository extends JpaRepository<Sesion, Long> {
    // Busca todas las sesiones asociadas a una rutina
    List<Sesion> findByRutina(Rutina rutina);
}