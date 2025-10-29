package com.ironfit.ironfit.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ironfit.ironfit.modelo.Sesion;
import com.ironfit.ironfit.servicio.SesionService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/sesiones")
@CrossOrigin(origins = "http://localhost:4200")
public class SesionController {

    private final SesionService sesionService;

    @Autowired
    public SesionController(SesionService sesionService) {
        this.sesionService = sesionService;
    }

    @GetMapping
    public ResponseEntity<List<Sesion>> listar() {
        return ResponseEntity.ok(sesionService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sesion> buscarPorId(@PathVariable Long id) {
        Optional<Sesion> sesion = sesionService.buscarPorId(id);
        return sesion.map(ResponseEntity::ok)
                        .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Sesion> guardar(@RequestBody Sesion sesion) {
        return ResponseEntity.ok(sesionService.guardar(sesion));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        sesionService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
