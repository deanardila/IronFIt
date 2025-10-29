package com.ironfit.ironfit.modelo;
import jakarta.persistence.*;
@Entity
@Table(name = "plan_nutricion")
public class PlanNutricion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNutricion;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_plan")
    private PlanEntrenamiento plan;

    private Short kcalObjetivo;
    private Short proteinaG;
    private Short carboG;
    private Short grasaG;

    @Lob
    private String descripcion;

    public PlanNutricion() {
    }

    public Long getIdNutricion() {
        return idNutricion;
    }

    public void setIdNutricion(Long idNutricion) {
        this.idNutricion = idNutricion;
    }

    public PlanEntrenamiento getPlan() {
        return plan;
    }

    public void setPlan(PlanEntrenamiento plan) {
        this.plan = plan;
    }

    public Short getKcalObjetivo() {
        return kcalObjetivo;
    }

    public void setKcalObjetivo(Short kcalObjetivo) {
        this.kcalObjetivo = kcalObjetivo;
    }

    public Short getProteinaG() {
        return proteinaG;
    }

    public void setProteinaG(Short proteinaG) {
        this.proteinaG = proteinaG;
    }

    public Short getCarboG() {
        return carboG;
    }

    public void setCarboG(Short carboG) {
        this.carboG = carboG;
    }

    public Short getGrasaG() {
        return grasaG;
    }

    public void setGrasaG(Short grasaG) {
        this.grasaG = grasaG;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
