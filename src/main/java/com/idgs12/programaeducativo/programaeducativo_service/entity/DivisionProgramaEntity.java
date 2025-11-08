package com.idgs12.programaeducativo.programaeducativo_service.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "division_programaeducativo")
@Data
public class DivisionProgramaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Long idDivision;

}
