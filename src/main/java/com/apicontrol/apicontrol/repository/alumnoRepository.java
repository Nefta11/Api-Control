package com.apicontrol.apicontrol.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apicontrol.apicontrol.entity.Alumno;

public interface alumnoRepository extends JpaRepository <Alumno, Long> {
    
}
