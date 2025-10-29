package com.ironfit.ironfit.modelo;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
public class RutinaEjercicioId implements Serializable {
    private Long idRutina;
    private Long idEjercicio;
    private Short orden;
}
