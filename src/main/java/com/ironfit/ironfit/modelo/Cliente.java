package com.ironfit.ironfit.modelo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cliente")


public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    private String tipoDoc;
    private String nroDoc;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String email;
    private Boolean activo = true;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PlanEntrenamiento> planes;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EvaluacionFisica> evaluaciones;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Progreso> progresos;
}
