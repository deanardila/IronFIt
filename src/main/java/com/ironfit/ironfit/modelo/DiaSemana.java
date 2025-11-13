package com.ironfit.ironfit.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "dia_semana")
public class DiaSemana {

    @Id
    private Byte id; // 1-7

    @Column(nullable = false, length = 15)
    private String nombre;

    @Column(nullable = false, length = 3)
    private String abreviatura;

    // Constructor vacío
    public DiaSemana() {}


    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    
}