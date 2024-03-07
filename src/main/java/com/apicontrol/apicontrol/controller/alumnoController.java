package com.apicontrol.apicontrol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apicontrol.apicontrol.entity.Alumno;
import com.apicontrol.apicontrol.service.alumnoService;

@RestController
@RequestMapping(path = "/api/Alumno")
public class alumnoController {
    

    @Autowired
    private alumnoService alumnoService;

    @PostMapping
    public Alumno save(@RequestBody Alumno alumno){
        return alumnoService.saveAlumno(alumno);
    }
}
