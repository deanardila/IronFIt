package com.ironfit.ironfit.controlador.rutina;

import com.ironfit.ironfit.modelo.rutina.RutinaEjercicio;
import com.ironfit.ironfit.modelo.rutina.RutinaEjercicioId;
import com.ironfit.ironfit.servicio.rutina.RutinaEjercicioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rutina-ejercicios")
@CrossOrigin(origins = "http://localhost:4200")
public class RutinaEjercicioController {
    
    private final RutinaEjercicioService rutinaEjercicioService;

    //Constructor
    @Autowired
    public RutinaEjercicioController(RutinaEjercicioService rutinaEjercicioService) {
        this.rutinaEjercicioService = rutinaEjercicioService;
    }

    // GET → Devuelve todos los registros de la tabla.
    @GetMapping
    public ResponseEntity<List<RutinaEjercicio>> listarTodo() {
        List<RutinaEjercicio> lista = rutinaEjercicioService.listarTodo();
        return ResponseEntity.ok(lista);
    }

    //GET → Busca un registro por su clave compuesta (rutinaId, ejercicioId, orden)
    @GetMapping("/{rutinaId}/{ejercicioId}/{orden}")
    public ResponseEntity<RutinaEjercicio> buscarPorId(
            @PathVariable Long rutinaId,
            @PathVariable Long ejercicioId,
            @PathVariable Short orden) {

        RutinaEjercicioId id = new RutinaEjercicioId(rutinaId, ejercicioId, orden);
        Optional<RutinaEjercicio> encontrado = rutinaEjercicioService.buscarPorId(id);
        return encontrado.map(ResponseEntity::ok)
                            .orElse(ResponseEntity.notFound().build());
    }

    //POST → Crea o actualiza un registro de RutinaEjercicio
    @PostMapping
    public ResponseEntity<RutinaEjercicio> guardar(@RequestBody RutinaEjercicio rutinaEjercicio) {
        RutinaEjercicio nuevo = rutinaEjercicioService.guardar(rutinaEjercicio);
        return ResponseEntity.ok(nuevo);
    }

    //DELETE → Elimina un registro por su clave compuesta

    @DeleteMapping("/{rutinaId}/{ejercicioId}/{orden}")
    public ResponseEntity<Void> eliminar(
            @PathVariable Long rutinaId,
            @PathVariable Long ejercicioId,
            @PathVariable Short orden) {

        RutinaEjercicioId id = new RutinaEjercicioId(rutinaId, ejercicioId, orden);
        rutinaEjercicioService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
