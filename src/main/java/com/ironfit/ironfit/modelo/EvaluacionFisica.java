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
}
