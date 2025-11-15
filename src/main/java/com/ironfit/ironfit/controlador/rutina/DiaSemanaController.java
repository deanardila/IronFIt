package com.ironfit.ironfit.controlador.rutina;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ironfit.ironfit.modelo.rutina.DiaSemana;
import com.ironfit.ironfit.servicio.rutina.DiaSemanaService;

@RestController
@RequestMapping("/api/dias")
public class DiaSemanaController {
    @Autowired
    private DiaSemanaService diaSemanaService;

    @GetMapping
    public List<DiaSemana> obtenerDias() {
        return diaSemanaService.listarDias();
    }
}