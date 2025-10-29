package com.ironfit.ironfit.modelo;
import jakarta.persistence.*;

@Entity
@Table(name = "administrador")

public class Administrador {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdmin;

    private String nombres;
    private String apellidos;

    @Column(unique = true, nullable = false)
    private String usuario;

    @Column(nullable = false)
    private String clave;

    private String email;
    private String telefono;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Rol rol;

    public enum Rol {
        SUPERADMIN, ASISTENTE
    }
}
