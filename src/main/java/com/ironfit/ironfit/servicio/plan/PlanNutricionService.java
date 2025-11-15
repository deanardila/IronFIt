package com.ironfit.ironfit.servicio.plan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ironfit.ironfit.modelo.plan.PlanNutricion;
import com.ironfit.ironfit.repositorio.plan.PlanNutricionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PlanNutricionService {

    private final PlanNutricionRepository planNutricionRepo;

    @Autowired
    public PlanNutricionService(PlanNutricionRepository planNutricionRepo) {
        this.planNutricionRepo = planNutricionRepo;
    }

    // Devuelve todos los planes nutricionales
    public List<PlanNutricion> listar() {
        return planNutricionRepo.findAll();
    }

    // Busca un plan por ID
    public Optional<PlanNutricion> buscarPorId(Long id) {
        return planNutricionRepo.findById(id);
    }

    // Guarda o actualiza un plan
    public PlanNutricion guardar(PlanNutricion planNutricion) {
        return planNutricionRepo.save(planNutricion);
    }

    // Elimina un plan por ID
    public void eliminar(Long id) {
        planNutricionRepo.deleteById(id);
    }
}
