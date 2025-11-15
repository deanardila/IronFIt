package com.ironfit.ironfit.servicio.plan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ironfit.ironfit.modelo.plan.PlanEntrenamiento;
import com.ironfit.ironfit.repositorio.plan.PlanEntrenamientoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PlanEntrenamientoService {

    private final PlanEntrenamientoRepository planRepo;

    @Autowired
    public PlanEntrenamientoService(PlanEntrenamientoRepository planRepo) {
        this.planRepo = planRepo;
    }

    public List<PlanEntrenamiento> listar() {
        return planRepo.findAll();
    }

    public Optional<PlanEntrenamiento> buscarPorId(Long id) {
        return planRepo.findById(id);
    }

    public PlanEntrenamiento guardar(PlanEntrenamiento plan) {
        return planRepo.save(plan);
    }

    public void eliminar(Long id) {
        planRepo.deleteById(id);
    }
}
