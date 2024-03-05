package com.apicontrol.apicontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apicontrol.apicontrol.entity.Administrativo;

public interface administrativo extends JpaRepository <Administrativo, Long> {
    
}
