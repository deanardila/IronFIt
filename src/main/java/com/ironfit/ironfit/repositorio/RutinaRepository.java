package com.ironfit.ironfit.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ironfit.ironfit.modelo.Rutina;
import com.ironfit.ironfit.modelo.PlanEntrenamiento;

import java.util.List;

@Repository
public interface RutinaRepository extends JpaRepository<Rutina, Long> {
    // Busca todas las rutinas de un plan de entrenamiento
    List<Rutina> findByPlan(PlanEntrenamiento plan);
}
