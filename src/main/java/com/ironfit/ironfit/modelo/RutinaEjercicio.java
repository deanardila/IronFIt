package com.ironfit.ironfit.modelo;
import jakarta.persistence.*;
@Entity
@Table(name = "rutina_ejercicio")
public class RutinaEjercicio {
    @EmbeddedId
    private RutinaEjercicioId id;

    /** Rutina asociada */
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idRutina")
    @JoinColumn(name = "id_rutina")
    private Rutina rutina;

    /** Ejercicio asociado */
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("idEjercicio")
    @JoinColumn(name = "id_ejercicio")
    private Ejercicio ejercicio;

    private Short series;
    private String repeticiones;
    private Short tiempoSeg;
    private Double pesoObjetivo;
    private Short descansoSeg;
}
