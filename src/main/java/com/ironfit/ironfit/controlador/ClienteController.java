package com.ironfit.ironfit.controlador;
import com.ironfit.ironfit.modelo.Cliente;
import com.ironfit.ironfit.servicio.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = "http://localhost:4200") // Permite conexión desde el frontend

public class ClienteController {
    private final ClienteService clienteService;

    // Constructor
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    /** GET → Lista todos los clientes */
    @GetMapping
    public ResponseEntity<List<Cliente>> listarClientes() {
        return ResponseEntity.ok(clienteService.listarClientes());
    }

    /** GET → Busca un cliente por su ID */
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> obtenerPorId(@PathVariable Long id) {
        return clienteService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    /** POST → Registra un nuevo cliente */
    @PostMapping
    public ResponseEntity<Cliente> registrar(@RequestBody Cliente cliente) {
        Cliente creado = clienteService.registrarCliente(cliente);
        return ResponseEntity.status(201).body(creado);
    }

    /** PUT → Actualiza datos de un cliente existente */
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> actualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        Cliente actualizado = clienteService.actualizarCliente(id, cliente);
        return ResponseEntity.ok(actualizado);
    }

    /** DELETE → Elimina un cliente por ID */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        clienteService.eliminarCliente(id);
        return ResponseEntity.noContent().build();
    }
}
