package com.ironfit.ironfit.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ironfit.ironfit.modelo.EvaluacionFisica;
import com.ironfit.ironfit.servicio.EvaluacionFisicaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/evaluaciones")
@CrossOrigin(origins = "http://localhost:4200")
public class EvaluacionFisicaController {

    private final EvaluacionFisicaService evaluacionService;

    @Autowired
    public EvaluacionFisicaController(EvaluacionFisicaService evaluacionService) {
        this.evaluacionService = evaluacionService;
    }

    //GET → Lista todas las evaluaciones físicas
    @GetMapping
    public ResponseEntity<List<EvaluacionFisica>> listar() {
        return ResponseEntity.ok(evaluacionService.listar());
    }

    //GET → Busca una evaluación física por ID
    @GetMapping("/{id}")
    public ResponseEntity<EvaluacionFisica> buscarPorId(@PathVariable Long id) {
        Optional<EvaluacionFisica> evaluacion = evaluacionService.buscarPorId(id);
        return evaluacion.map(ResponseEntity::ok)
                                .orElse(ResponseEntity.notFound().build());
    }

    //POST → Crea o actualiza una evaluación física
    @PostMapping
    public ResponseEntity<EvaluacionFisica> guardar(@RequestBody EvaluacionFisica evaluacion) {
        return ResponseEntity.ok(evaluacionService.guardar(evaluacion));
    }

    //DELETE → Elimina una evaluación física por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        evaluacionService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
