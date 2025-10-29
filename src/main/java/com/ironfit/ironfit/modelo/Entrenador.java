package com.ironfit.ironfit.modelo;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "entrenador")

public class Entrenador {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEntrenador;

    private String tipoDoc;
    private String nroDoc;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String email;
    private String especialidad;
    private Boolean activo = true;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_admin")
    private Administrador administrador;

    @OneToMany(mappedBy = "entrenador", cascade = CascadeType.ALL)
    private List<PlanEntrenamiento> planes;
}
