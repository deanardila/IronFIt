package com.ironfit.ironfit.modelo;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "progreso")

public class Progreso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProgreso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    private LocalDate fecha;
    private String titulo;
    @Lob
    private String detalle;
    private String urlFoto;

    private Double pesoKg;
    private Double tallaM;
    private Double imc;
    private Double cinturaCm;
    private Double caderaCm;
    private Double brazosCm;
    private Double piernasCm;

    private String prEjercicio;
    private String prValor;
}
