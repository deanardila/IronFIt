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
}
