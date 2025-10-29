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

    public Cliente() {
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNroDoc() {
        return nroDoc;
    }

    public void setNroDoc(String nroDoc) {
        this.nroDoc = nroDoc;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public List<PlanEntrenamiento> getPlanes() {
        return planes;
    }

    public void setPlanes(List<PlanEntrenamiento> planes) {
        this.planes = planes;
    }

    public List<EvaluacionFisica> getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(List<EvaluacionFisica> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    public List<Progreso> getProgresos() {
        return progresos;
    }

    public void setProgresos(List<Progreso> progresos) {
        this.progresos = progresos;
    }

    
}
