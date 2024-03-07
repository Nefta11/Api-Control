package com.apicontrol.apicontrol.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping
    public List<Alumno> getAllAlumnos(){
        return alumnoService.getAllAlumnos();
    }

    @GetMapping("/{alumnoID}")
    public Optional<Alumno>getBId(@PathVariable("alumnoID") Long alumnoID){
        return alumnoService.getAlumno(alumnoID);
    }

    @PutMapping("/{alumnoID}")
    public Alumno updateAlumno(@PathVariable Long alumnoID, @RequestBody Alumno alumno){
        return alumnoService.updateAlumno(alumnoID, alumno);
    }
    
    @DeleteMapping("/{alumnoID}")
    public String deleteAlumno(@PathVariable("alumnoID")Long alumnoID){
        return "Eliminado exitosamente";
    }

}
