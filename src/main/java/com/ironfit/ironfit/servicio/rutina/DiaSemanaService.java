package com.ironfit.ironfit.servicio.rutina;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ironfit.ironfit.modelo.rutina.DiaSemana;
import com.ironfit.ironfit.repositorio.rutina.DiaSemanaRepository;
@Service
public class DiaSemanaService {
    @Autowired
    private DiaSemanaRepository diaSemanaRepository;

    public List<DiaSemana> listarDias() {
        return diaSemanaRepository.findAll();
    }
}
