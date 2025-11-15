package com.ironfit.ironfit.repositorio.plan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ironfit.ironfit.modelo.plan.PlanEntrenamiento;
import com.ironfit.ironfit.modelo.plan.PlanNutricion;

@Repository
public interface PlanNutricionRepository extends JpaRepository<PlanNutricion, Long> {
    // Busca el plan nutricional de un plan de entrenamiento
    PlanNutricion findByPlan(PlanEntrenamiento plan);
}
