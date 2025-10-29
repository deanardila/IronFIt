package com.ironfit.ironfit.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ironfit.ironfit.modelo.Progreso;
import com.ironfit.ironfit.repositorio.ProgresoRepository;

import java.util.List;
import java.util.Optional;


@Service
public class ProgresoService {

    private final ProgresoRepository progresoRepo;

    @Autowired
    public ProgresoService(ProgresoRepository progresoRepo) {
        this.progresoRepo = progresoRepo;
    }

    // Lista todos los progresos registrados
    public List<Progreso> listar() {
        return progresoRepo.findAll();
    }

    // Busca un progreso por su ID
    public Optional<Progreso> buscarPorId(Long id) {
        return progresoRepo.findById(id);
    }

    // Guarda o actualiza un progreso
    public Progreso guardar(Progreso progreso) {
        return progresoRepo.save(progreso);
    }

    // Elimina un progreso por su ID
    public void eliminar(Long id) {
        progresoRepo.deleteById(id);
    }
}