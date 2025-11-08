package com.idgs12.programaeducativo.programaeducativo_service.dto;

import lombok.Data;

@Data
public class ProgramaDivisionDTO {
    private int id;
    private String nombrePrograma;
    private String descripcionPrograma;
    private String nombreDivision;
    private boolean activo;
}
