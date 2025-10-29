package com.ironfit.ironfit.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ironfit.ironfit.modelo.Progreso;
import com.ironfit.ironfit.modelo.Cliente;

import java.util.List;

@Repository
public interface ProgresoRepository extends JpaRepository<Progreso, Long> {
    // Busca el progreso de un cliente en orden descendente por fecha
    List<Progreso> findByClienteOrderByFechaDesc(Cliente cliente);
}