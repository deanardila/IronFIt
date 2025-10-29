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
    
    public Sesion() {
    }

    public Long getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(Long idSesion) {
        this.idSesion = idSesion;
    }

    public Rutina getRutina() {
        return rutina;
    }

    public void setRutina(Rutina rutina) {
        this.rutina = rutina;
    }

    public Byte getIdDia() {
        return idDia;
    }

    public void setIdDia(Byte idDia) {
        this.idDia = idDia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    
}
