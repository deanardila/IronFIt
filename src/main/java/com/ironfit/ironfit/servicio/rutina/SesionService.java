package com.ironfit.ironfit.servicio.rutina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ironfit.ironfit.modelo.rutina.Sesion;
import com.ironfit.ironfit.repositorio.rutina.SesionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SesionService {

    private final SesionRepository sesionRepo;

    @Autowired
    public SesionService(SesionRepository sesionRepo) {
        this.sesionRepo = sesionRepo;
    }

    public List<Sesion> listar() {
        return sesionRepo.findAll();
    }

    public Optional<Sesion> buscarPorId(Long id) {
        return sesionRepo.findById(id);
    }

    public Sesion guardar(Sesion sesion) {
        return sesionRepo.save(sesion);
    }

    public void eliminar(Long id) {
        sesionRepo.deleteById(id);
    }
}