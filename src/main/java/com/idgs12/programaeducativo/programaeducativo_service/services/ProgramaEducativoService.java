package com.idgs12.programaeducativo.programaeducativo_service.services;

import java.util.*;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idgs12.programaeducativo.programaeducativo_service.FeignClient.DivisionFeignClient;
import com.idgs12.programaeducativo.programaeducativo_service.dto.*;
import com.idgs12.programaeducativo.programaeducativo_service.entity.*;
import com.idgs12.programaeducativo.programaeducativo_service.repository.ProgramaEducativoRepository;

@Service
public class ProgramaEducativoService {

    @Autowired
    private ProgramaEducativoRepository programaEducativoRepository;

    @Autowired
    private DivisionFeignClient divisionFeignClient;

    @Transactional
    public ProgramaEducativoEntity crearPrograma(ProgramaEducativoDTO dto) {
        DivisionDTO division = divisionFeignClient.getDivisionById(dto.getIdDivision());

        if (division == null) {
            throw new RuntimeException("La división con ID " + dto.getIdDivision() + " no existe");
        }

        ProgramaEducativoEntity programa = new ProgramaEducativoEntity();
        programa.setNombre(dto.getNombre());
        programa.setDescripcion(dto.getDescripcion());
        programa.setActivo(true);

        DivisionProgramaEntity relacion = new DivisionProgramaEntity();
        relacion.setIdDivision(dto.getIdDivision());

        programa.setDivisionProgramas(Arrays.asList(relacion));

        return programaEducativoRepository.save(programa);
    }

}
