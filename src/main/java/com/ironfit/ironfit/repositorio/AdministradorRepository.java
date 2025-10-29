package com.ironfit.ironfit.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ironfit.ironfit.modelo.Administrador;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Long> {
    // Busca un administrador por su nombre de usuario
    Administrador findByUsuario(String usuario);
}