package com.joao.bankbackapi.controllers.entities;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class SimulationNotFoundExeception extends RuntimeException {
    public SimulationNotFoundExeception(String message) {
        super(message);
    }
}
