package com.teste.veiculos.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/carro")
public interface CarroAPI {

    //CADASTRO DE VEICULOS
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    CarroResponse postCarro(@RequestBody CarroRequest carroRequest);
}