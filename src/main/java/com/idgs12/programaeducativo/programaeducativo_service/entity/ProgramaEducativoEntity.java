package com.idgs12.programaeducativo.programaeducativo_service.entity;

import lombok.Data;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "programa_educativo")
@Data
public class ProgramaEducativoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private String descripcion;
    private boolean activo;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id_programa_educativo")
    private List<DivisionProgramaEntity> divisionProgramas;
}
