package com.ironfit.ironfit.modelo.evaluacion;

import com.ironfit.ironfit.modelo.seguridad.Usuario;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "progreso")

public class Progreso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_progreso")
    private Long idProgreso;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;   // Cliente al que pertenece el registro

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "titulo", length = 120, nullable = false)
    private String titulo;

    @Column(name = "detalle", columnDefinition = "TEXT")
    private String detalle;

    public Progreso() {
    }

    public Long getIdProgreso() {
        return idProgreso;
    }

    public void setIdProgreso(Long idProgreso) {
        this.idProgreso = idProgreso;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}

