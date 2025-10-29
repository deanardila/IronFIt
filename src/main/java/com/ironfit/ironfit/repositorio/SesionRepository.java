package com.ironfit.ironfit.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ironfit.ironfit.modelo.Sesion;
import com.ironfit.ironfit.modelo.Rutina;

import java.util.List;

@Repository
public interface SesionRepository extends JpaRepository<Sesion, Long> {
    // Busca todas las sesiones asociadas a una rutina
    List<Sesion> findByRutina(Rutina rutina);
}