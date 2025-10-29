package com.ironfit.ironfit.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ironfit.ironfit.modelo.Asistencia;
import com.ironfit.ironfit.modelo.Cliente;

import java.util.List;

@Repository
public interface AsistenciaRepository extends JpaRepository<Asistencia, Long> {
    // Busca las asistencias de un cliente por fecha
    List<Asistencia> findByClienteOrderByFechaDesc(Cliente cliente);
}