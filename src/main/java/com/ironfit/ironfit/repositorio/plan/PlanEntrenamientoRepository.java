package com.ironfit.ironfit.repositorio.plan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ironfit.ironfit.modelo.Cliente;
import com.ironfit.ironfit.modelo.plan.PlanEntrenamiento;

import java.util.List;

@Repository
public interface PlanEntrenamientoRepository extends JpaRepository<PlanEntrenamiento, Long> {
    // Busca todos los planes asociados a un cliente
    List<PlanEntrenamiento> findByCliente(Cliente cliente);
}
