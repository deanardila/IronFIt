package com.ironfit.ironfit.modelo;
import jakarta.persistence.*;
import java.time.LocalTime;
@Entity
@Table(name = "sesion")
public class Sesion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSesion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rutina")
    private Rutina rutina;

    @Column(name = "id_dia")
    private Byte idDia;

    private LocalTime hora;

    private String notas;
}
