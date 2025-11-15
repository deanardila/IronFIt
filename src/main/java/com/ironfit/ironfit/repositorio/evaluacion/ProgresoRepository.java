package com.ironfit.ironfit.repositorio.evaluacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ironfit.ironfit.modelo.Cliente;
import com.ironfit.ironfit.modelo.evaluacion.Progreso;

import java.util.List;

@Repository
public interface ProgresoRepository extends JpaRepository<Progreso, Long> {
    // Busca el progreso de un cliente en orden descendente por fecha
    List<Progreso> findByClienteOrderByFechaDesc(Cliente cliente);
}