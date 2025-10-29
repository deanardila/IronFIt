package com.ironfit.ironfit.modelo;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name = "ejercicio")
public class Ejercicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEjercicio;

    private String nombre;
    private String categoria;       
    private String grupoMuscular;   
    private String descripcion;

    @OneToMany(mappedBy = "ejercicio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RutinaEjercicio> detalles;
}
