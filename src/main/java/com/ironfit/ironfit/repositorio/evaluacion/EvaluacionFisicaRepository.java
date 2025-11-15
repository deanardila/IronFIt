package com.ironfit.ironfit.repositorio.evaluacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ironfit.ironfit.modelo.Cliente;
import com.ironfit.ironfit.modelo.evaluacion.EvaluacionFisica;

import java.util.List;

@Repository
public interface EvaluacionFisicaRepository extends JpaRepository<EvaluacionFisica, Long> {
    // Busca todas las evaluaciones físicas de un cliente
    List<EvaluacionFisica> findByClienteOrderByFechaDesc(Cliente cliente);
}
