package com.ironfit.ironfit.modelo;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "evaluacion_fisica")

public class EvaluacionFisica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEval;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_admin")
    private Administrador administrador;

    private LocalDate fecha;
    private Double pesoKg;
    private Double tallaM;
    private Double grasaPct;
    private Double cinturaCm;
    private Double caderaCm;
    private Double brazosCm;
    private Double piernasCm;

    @Lob
    private String notas;

    @Transient
    public Double getImc() {
        if (tallaM != null && tallaM > 0 && pesoKg != null)
            return pesoKg / (tallaM * tallaM);
        return null;
    }

    public EvaluacionFisica() {
    }

    public Long getIdEval() {
        return idEval;
    }

    public void setIdEval(Long idEval) {
        this.idEval = idEval;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
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

    public Double getGrasaPct() {
        return grasaPct;
    }

    public void setGrasaPct(Double grasaPct) {
        this.grasaPct = grasaPct;
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

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    
}
