package com.ironfit.ironfit.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ironfit.ironfit.modelo.EvaluacionFisica;
import com.ironfit.ironfit.repositorio.EvaluacionFisicaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EvaluacionFisicaService {

    private final EvaluacionFisicaRepository evaluacionRepo;

    @Autowired
    public EvaluacionFisicaService(EvaluacionFisicaRepository evaluacionRepo) {
        this.evaluacionRepo = evaluacionRepo;
    }

    // Lista todas las evaluaciones
    public List<EvaluacionFisica> listar() {
        return evaluacionRepo.findAll();
    }

    // Busca una evaluación por ID
    public Optional<EvaluacionFisica> buscarPorId(Long id) {
        return evaluacionRepo.findById(id);
    }

    // Guarda o actualiza una evaluación física
    public EvaluacionFisica guardar(EvaluacionFisica evaluacion) {
        return evaluacionRepo.save(evaluacion);
    }

    // Elimina una evaluación física
    public void eliminar(Long id) {
        evaluacionRepo.deleteById(id);
    }
}
