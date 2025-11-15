package com.ironfit.ironfit.repositorio.rutina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ironfit.ironfit.modelo.plan.PlanEntrenamiento;
import com.ironfit.ironfit.modelo.rutina.Rutina;

import java.util.List;

@Repository
public interface RutinaRepository extends JpaRepository<Rutina, Long> {
    // Busca todas las rutinas de un plan de entrenamiento
    List<Rutina> findByPlan(PlanEntrenamiento plan);
}
