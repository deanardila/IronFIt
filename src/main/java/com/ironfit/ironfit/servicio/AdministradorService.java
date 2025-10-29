package com.ironfit.ironfit.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ironfit.ironfit.modelo.Administrador;
import com.ironfit.ironfit.repositorio.AdministradorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AdministradorService {

    private final AdministradorRepository administradorRepo;

    @Autowired
    public AdministradorService(AdministradorRepository administradorRepo) {
        this.administradorRepo = administradorRepo;
    }

    // Devuelve todos los administradores registrados
    public List<Administrador> listar() {
        return administradorRepo.findAll();
    }

    // Busca un administrador por su ID
    public Optional<Administrador> buscarPorId(Long id) {
        return administradorRepo.findById(id);
    }

    // Guarda o actualiza un administrador
    public Administrador guardar(Administrador administrador) {
        return administradorRepo.save(administrador);
    }

    // Elimina un administrador por su ID
    public void eliminar(Long id) {
        administradorRepo.deleteById(id);
    }
}
