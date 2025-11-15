package com.ironfit.ironfit.servicio.rutina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ironfit.ironfit.modelo.rutina.Ejercicio;
import com.ironfit.ironfit.modelo.rutina.Rutina;
import com.ironfit.ironfit.modelo.rutina.RutinaEjercicio;
import com.ironfit.ironfit.modelo.rutina.RutinaEjercicioId;
import com.ironfit.ironfit.repositorio.rutina.RutinaEjercicioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RutinaEjercicioService {

    private final RutinaEjercicioRepository rutinaEjercicioRepo;

    //Constructor
    @Autowired
    public RutinaEjercicioService(RutinaEjercicioRepository rutinaEjercicioRepo) {
        this.rutinaEjercicioRepo = rutinaEjercicioRepo;
    }

    //Devuelve todos los registros de RutinaEjercicio
    public List<RutinaEjercicio> listarTodo() {
        return rutinaEjercicioRepo.findAll();
    }

    //Devuelve todos los ejercicios que pertenecen a una rutina específica
    public List<RutinaEjercicio> listarPorRutina(Rutina rutina) {
        return rutinaEjercicioRepo.findByRutina(rutina);
    }

    //Busca un registro específico por su clave compuesta (rutina + ejercicio + orden)
    public Optional<RutinaEjercicio> buscarPorId(RutinaEjercicioId id) {
        return rutinaEjercicioRepo.findById(id);
    }

    //Guarda o actualiza un registro de RutinaEjercicio
    public RutinaEjercicio guardar(RutinaEjercicio rutinaEjercicio) {
        return rutinaEjercicioRepo.save(rutinaEjercicio);
    }

    //Elimina un registro de RutinaEjercicio por su ID
    public void eliminar(RutinaEjercicioId id) {
        rutinaEjercicioRepo.deleteById(id);
    }

    //Busca un ejercicio dentro de una rutina específica.

    public RutinaEjercicio buscarPorRutinaYEjercicio(Rutina rutina, Ejercicio ejercicio) {
        return rutinaEjercicioRepo.findByRutinaAndEjercicio(rutina, ejercicio);
    }
}
