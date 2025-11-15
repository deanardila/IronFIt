package com.ironfit.ironfit.modelo.rutina;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RutinaEjercicioId implements Serializable {
    private Long rutinaId;
    private Long ejercicioId;
    private Short orden;
    
    public RutinaEjercicioId() {
    }

    public RutinaEjercicioId(Long rutinaId, Long ejercicioId, Short orden) {
        this.rutinaId = rutinaId;
        this.ejercicioId = ejercicioId;
        this.orden = orden;
    }
    
    public Long getRutinaId() {
        return rutinaId;
    }

    public void setRutinaId(Long rutinaId) {
        this.rutinaId = rutinaId;
    }

    public Long getEjercicioId() {
        return ejercicioId;
    }

    public void setEjercicioId(Long ejercicioId) {
        this.ejercicioId = ejercicioId;
    }

    public Short getOrden() {
        return orden;
    }

    public void setOrden(Short orden) {
        this.orden = orden;
    }

     // hashCode y equals obligatorios para claves compuestas
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RutinaEjercicioId)) return false;
        RutinaEjercicioId that = (RutinaEjercicioId) o;
        return Objects.equals(rutinaId, that.rutinaId) &&
                Objects.equals(ejercicioId, that.ejercicioId) &&
                Objects.equals(orden, that.orden);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rutinaId, ejercicioId, orden);
    }
}
