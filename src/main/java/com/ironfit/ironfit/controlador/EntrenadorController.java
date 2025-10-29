package com.ironfit.ironfit.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ironfit.ironfit.modelo.Entrenador;
import com.ironfit.ironfit.servicio.EntrenadorService;

import java.util.List;


@RestController
@RequestMapping("/api/entrenadores")
@CrossOrigin(origins = "http://localhost:4200")
public class EntrenadorController {

    private final EntrenadorService entrenadorService;

    @Autowired
    public EntrenadorController(EntrenadorService entrenadorService) {
        this.entrenadorService = entrenadorService;
    }

    @GetMapping
    public ResponseEntity<List<Entrenador>> listar() {
        return ResponseEntity.ok(entrenadorService.listar());
    }

    @PostMapping
    public ResponseEntity<Entrenador> guardar(@RequestBody Entrenador entrenador) {
        return ResponseEntity.ok(entrenadorService.guardar(entrenador));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        entrenadorService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}