package com.ironfit.ironfit.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ironfit.ironfit.modelo.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {
    // Busca todos los clientes que están activos
    java.util.List<Cliente> findByActivoTrue();
}
