package com.ironfit.ironfit.controlador.plan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ironfit.ironfit.modelo.plan.PlanNutricion;
import com.ironfit.ironfit.servicio.plan.PlanNutricionService;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/nutricion")
@CrossOrigin(origins = "http://localhost:4200")
public class PlanNutricionController {

    private final PlanNutricionService planNutricionService;

    @Autowired
    public PlanNutricionController(PlanNutricionService planNutricionService) {
        this.planNutricionService = planNutricionService;
    }

    //GET → Lista todos los planes nutricionales
    @GetMapping
    public ResponseEntity<List<PlanNutricion>> listar() {
        return ResponseEntity.ok(planNutricionService.listar());
    }

    //GET → Busca un plan nutricional por ID
    @GetMapping("/{id}")
    public ResponseEntity<PlanNutricion> buscarPorId(@PathVariable Long id) {
        Optional<PlanNutricion> plan = planNutricionService.buscarPorId(id);
        return plan.map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
    }

    //POST → Crea o actualiza un plan nutricional
    @PostMapping
    public ResponseEntity<PlanNutricion> guardar(@RequestBody PlanNutricion plan) {
        return ResponseEntity.ok(planNutricionService.guardar(plan));
    }

    //DELETE → Elimina un plan nutricional por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        planNutricionService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
