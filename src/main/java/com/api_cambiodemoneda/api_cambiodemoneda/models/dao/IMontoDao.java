package com.api_cambiodemoneda.api_cambiodemoneda.models.dao;

import com.api_cambiodemoneda.api_cambiodemoneda.models.entities.Monto;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

/**
 * IMontoDao
 */
@Repository
public interface IMontoDao extends R2dbcRepository<Monto,String> {
}