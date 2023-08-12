package com.api_cambiodemoneda.api_cambiodemoneda.models.dao.services;

import com.api_cambiodemoneda.api_cambiodemoneda.models.entities.Monto;

import reactor.core.publisher.Mono;

import com.api_cambiodemoneda.api_cambiodemoneda.models.dao.IMontoDao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MontoServiceImpl implements IMontoService {
    
    @Autowired
    private IMontoDao montoDao;

    @Override
    public Mono<Monto> findById(String id){
        return montoDao.findById(id);
    }

    @Override
    public Mono<Monto> save(Monto monto){
        return montoDao.save(monto);
    }

}
