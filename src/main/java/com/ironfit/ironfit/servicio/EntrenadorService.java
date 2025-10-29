package com.ironfit.ironfit.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ironfit.ironfit.modelo.Entrenador;
import com.ironfit.ironfit.repositorio.EntrenadorRepository;

import java.util.List;
import java.util.Optional;


@Service
public class EntrenadorService {

    private final EntrenadorRepository entrenadorRepo;

    @Autowired
    public EntrenadorService(EntrenadorRepository entrenadorRepo) {
        this.entrenadorRepo = entrenadorRepo;
    }

    public List<Entrenador> listar() {
        return entrenadorRepo.findAll();
    }

    public Optional<Entrenador> buscarPorId(Long id) {
        return entrenadorRepo.findById(id);
    }

    public Entrenador guardar(Entrenador entrenador) {
        return entrenadorRepo.save(entrenador);
    }

    public void eliminar(Long id) {
        entrenadorRepo.deleteById(id);
    }
}
