package com.ironfit.ironfit.controlador.evaluacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ironfit.ironfit.modelo.evaluacion.Progreso;
import com.ironfit.ironfit.servicio.evaluacion.ProgresoService;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/progreso")
@CrossOrigin(origins = "http://localhost:4200")
public class ProgresoController {

    private final ProgresoService progresoService;

    @Autowired
    public ProgresoController(ProgresoService progresoService) {
        this.progresoService = progresoService;
    }

    //GET → Lista todos los registros de progreso
    @GetMapping
    public ResponseEntity<List<Progreso>> listar() {
        return ResponseEntity.ok(progresoService.listar());
    }

    //GET → Busca un registro por su ID
    @GetMapping("/{id}")
    public ResponseEntity<Progreso> buscarPorId(@PathVariable Long id) {
        Optional<Progreso> progreso = progresoService.buscarPorId(id);
        return progreso.map(ResponseEntity::ok)
                        .orElse(ResponseEntity.notFound().build());
    }

    //POST → Crea o actualiza un registro de progreso
    @PostMapping
    public ResponseEntity<Progreso> guardar(@RequestBody Progreso progreso) {
        return ResponseEntity.ok(progresoService.guardar(progreso));
    }

    //DELETE → Elimina un registro de progreso por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        progresoService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}