package com.ironfit.ironfit.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ironfit.ironfit.modelo.PlanEntrenamiento;
import com.ironfit.ironfit.servicio.PlanEntrenamientoService;

import java.util.List;


@RestController
@RequestMapping("/api/planes")
@CrossOrigin(origins = "http://localhost:4200")
public class PlanEntrenamientoController {

    private final PlanEntrenamientoService planService;

    @Autowired
    public PlanEntrenamientoController(PlanEntrenamientoService planService) {
        this.planService = planService;
    }

    @GetMapping
    public ResponseEntity<List<PlanEntrenamiento>> listar() {
        return ResponseEntity.ok(planService.listar());
    }

    @PostMapping
    public ResponseEntity<PlanEntrenamiento> guardar(@RequestBody PlanEntrenamiento plan) {
        return ResponseEntity.ok(planService.guardar(plan));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        planService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}