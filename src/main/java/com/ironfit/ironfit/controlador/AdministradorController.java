package com.ironfit.ironfit.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ironfit.ironfit.modelo.Administrador;
import com.ironfit.ironfit.servicio.AdministradorService;

import java.util.List;


@RestController
@RequestMapping("/api/administradores")
@CrossOrigin(origins = "http://localhost:4200")
public class AdministradorController {

    private final AdministradorService administradorService;

    @Autowired
    public AdministradorController(AdministradorService administradorService) {
        this.administradorService = administradorService;
    }

    // GET → lista todos los administradores
    @GetMapping
    public ResponseEntity<List<Administrador>> listar() {
        return ResponseEntity.ok(administradorService.listar());
    }

    // POST → crea un nuevo administrador
    @PostMapping
    public ResponseEntity<Administrador> guardar(@RequestBody Administrador administrador) {
        return ResponseEntity.ok(administradorService.guardar(administrador));
    }

    // DELETE → elimina un administrador por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        administradorService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
