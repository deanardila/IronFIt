package com.ironfit.ironfit.repositorio.rutina;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ironfit.ironfit.modelo.rutina.Ejercicio;

@Repository
public interface EjercicioRepository extends JpaRepository<Ejercicio, Long> {
    // Busca ejercicios por nombre o grupo muscular
    java.util.List<Ejercicio> findByNombreContainingOrGrupoMuscularContaining(String nombre, String grupo);
}
