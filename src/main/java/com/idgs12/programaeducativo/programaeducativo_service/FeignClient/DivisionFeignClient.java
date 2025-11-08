package com.idgs12.programaeducativo.programaeducativo_service.FeignClient;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.idgs12.programaeducativo.programaeducativo_service.dto.DivisionDTO;

@FeignClient(name = "divisiones-service")
public interface DivisionFeignClient {

    @GetMapping("/api/divisiones/{id}")
    DivisionDTO getDivisionById(@PathVariable("id") Long id);

    @PostMapping("/api/divisiones/by-ids")
    List<DivisionDTO> obtenerDivisionesPorIds(@RequestBody List<Long> ids);
}
