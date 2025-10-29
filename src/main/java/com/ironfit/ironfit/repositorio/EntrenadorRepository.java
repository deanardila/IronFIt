package com.ironfit.ironfit.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ironfit.ironfit.modelo.Entrenador;

@Repository
public interface EntrenadorRepository extends JpaRepository<Entrenador, Long> {
    // Busca entrenadores por su especialidad
    java.util.List<Entrenador> findByEspecialidadContainingIgnoreCase(String especialidad);
}
