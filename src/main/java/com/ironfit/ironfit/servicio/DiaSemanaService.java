package com.ironfit.ironfit.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ironfit.ironfit.modelo.DiaSemana;
import com.ironfit.ironfit.repositorio.DiaSemanaRepository;
@Service
public class DiaSemanaService {
    @Autowired
    private DiaSemanaRepository diaSemanaRepository;

    public List<DiaSemana> listarDias() {
        return diaSemanaRepository.findAll();
    }
}
