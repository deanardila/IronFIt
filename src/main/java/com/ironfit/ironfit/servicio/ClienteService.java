package com.ironfit.ironfit.servicio;

import com.ironfit.ironfit.modelo.Cliente;
import com.ironfit.ironfit.repositorio.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClienteService {
    //Inyección del repositorio que accede a la tabla CLIENTE
    private final ClienteRepository clienteRepo;

    // Constructor para inyectar el repositorio
    @Autowired
    public ClienteService(ClienteRepository clienteRepo) {
        this.clienteRepo = clienteRepo;
    }

    // Devuelve una lista con todos los clientes registrados
    public List<Cliente> listarClientes() {
        return clienteRepo.findAll();
    }

    //Busca un cliente por su ID.
    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepo.findById(id);
    }

     //Registra un nuevo cliente
    public Cliente registrarCliente(Cliente cliente) {
        cliente.setActivo(true);
        return clienteRepo.save(cliente);
    }

     //Actualiza los datos de un cliente existente. (Solo modifica los campos básicos nombre, email, teléfono, etc.)
    public Cliente actualizarCliente(Long id, Cliente nuevosDatos) {
        Cliente existente = clienteRepo.findById(id).orElseThrow();
        existente.setNombres(nuevosDatos.getNombres());
        existente.setApellidos(nuevosDatos.getApellidos());
        existente.setTelefono(nuevosDatos.getTelefono());
        existente.setEmail(nuevosDatos.getEmail());
        return clienteRepo.save(existente);
    }

    //Elimina un cliente por su ID

    public void eliminarCliente(Long id) {
        clienteRepo.deleteById(id);
    }
}
