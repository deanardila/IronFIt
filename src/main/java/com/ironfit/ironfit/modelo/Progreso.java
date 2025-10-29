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
    
    public Progreso() {
    }

    public Long getIdProgreso() {
        return idProgreso;
    }

    public void setIdProgreso(Long idProgreso) {
        this.idProgreso = idProgreso;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public Double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(Double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public Double getTallaM() {
        return tallaM;
    }

    public void setTallaM(Double tallaM) {
        this.tallaM = tallaM;
    }

    public Double getImc() {
        return imc;
    }

    public void setImc(Double imc) {
        this.imc = imc;
    }

    public Double getCinturaCm() {
        return cinturaCm;
    }

    public void setCinturaCm(Double cinturaCm) {
        this.cinturaCm = cinturaCm;
    }

    public Double getCaderaCm() {
        return caderaCm;
    }

    public void setCaderaCm(Double caderaCm) {
        this.caderaCm = caderaCm;
    }

    public Double getBrazosCm() {
        return brazosCm;
    }

    public void setBrazosCm(Double brazosCm) {
        this.brazosCm = brazosCm;
    }

    public Double getPiernasCm() {
        return piernasCm;
    }

    public void setPiernasCm(Double piernasCm) {
        this.piernasCm = piernasCm;
    }

    public String getPrEjercicio() {
        return prEjercicio;
    }

    public void setPrEjercicio(String prEjercicio) {
        this.prEjercicio = prEjercicio;
    }

    public String getPrValor() {
        return prValor;
    }

    public void setPrValor(String prValor) {
        this.prValor = prValor;
    }

    
}
