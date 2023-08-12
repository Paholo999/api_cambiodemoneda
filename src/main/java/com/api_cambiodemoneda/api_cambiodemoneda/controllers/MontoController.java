package com.api_cambiodemoneda.api_cambiodemoneda.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import com.api_cambiodemoneda.api_cambiodemoneda.models.dao.services.IMontoService;
import com.api_cambiodemoneda.api_cambiodemoneda.models.entities.Monto;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value="/api/v1")
public class MontoController{
    
    @Autowired
    private IMontoService montoService;

    @GetMapping(value = "/montos/{id}")
    public Mono<ResponseEntity<Monto>> getMonto(@PathVariable String id){
        return montoService.findById(id)
            .map(monto -> new ResponseEntity<>(monto, HttpStatus.OK))
            .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

    @PostMapping("/montos")
    public Mono<ResponseEntity<Monto>> create(@RequestBody Monto monto){
        return montoService.save(monto)
            .map(montoGuardado -> new ResponseEntity<>(montoGuardado,HttpStatus.ACCEPTED))
            .defaultIfEmpty(new ResponseEntity<>(monto,HttpStatus.NOT_ACCEPTABLE));
    }   

}
