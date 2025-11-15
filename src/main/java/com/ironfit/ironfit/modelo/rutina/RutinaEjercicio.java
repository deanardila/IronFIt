package com.ironfit.ironfit.modelo.rutina;
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
    
    public RutinaEjercicio() {
    }

    public RutinaEjercicioId getId() {
        return id;
    }

    public void setId(RutinaEjercicioId id) {
        this.id = id;
    }

    public Rutina getRutina() {
        return rutina;
    }

    public void setRutina(Rutina rutina) {
        this.rutina = rutina;
    }

    public Ejercicio getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(Ejercicio ejercicio) {
        this.ejercicio = ejercicio;
    }

    public Short getSeries() {
        return series;
    }

    public void setSeries(Short series) {
        this.series = series;
    }

    public String getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(String repeticiones) {
        this.repeticiones = repeticiones;
    }

    public Short getTiempoSeg() {
        return tiempoSeg;
    }

    public void setTiempoSeg(Short tiempoSeg) {
        this.tiempoSeg = tiempoSeg;
    }

    public Double getPesoObjetivo() {
        return pesoObjetivo;
    }

    public void setPesoObjetivo(Double pesoObjetivo) {
        this.pesoObjetivo = pesoObjetivo;
    }

    public Short getDescansoSeg() {
        return descansoSeg;
    }

    public void setDescansoSeg(Short descansoSeg) {
        this.descansoSeg = descansoSeg;
    }

    
}
