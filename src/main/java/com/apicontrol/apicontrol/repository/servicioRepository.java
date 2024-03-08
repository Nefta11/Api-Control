package com.apicontrol.apicontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apicontrol.apicontrol.entity.Servicio;

public interface ServicioRepository extends JpaRepository <Servicio, Long> {
    
}
