package com.api_cambiodemoneda.api_cambiodemoneda.models.dao.services;

import com.api_cambiodemoneda.api_cambiodemoneda.models.entities.Monto;

import reactor.core.publisher.Mono;


public interface IMontoService{
    public Mono<Monto> findById(String id);
    public Mono<Monto> save(Monto monto);
}
