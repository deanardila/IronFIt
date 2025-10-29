package com.ironfit.ironfit.modelo;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
@Entity
@Table(name = "asistencia")
public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAsistencia;

    /** Cliente que asistió */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    /** Rutina asociada (puede ser nula si no aplica) */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rutina")
    private Rutina rutina;

    private LocalDate fecha;
    private LocalTime hora;
    private String observacion;
}
