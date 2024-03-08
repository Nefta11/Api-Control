package com.apicontrol.apicontrol.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apicontrol.apicontrol.entity.Alumno;
import com.apicontrol.apicontrol.repository.AlumnoRepository;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    public Alumno saveAlumno(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    public List<Alumno> getAllAlumnos() {
        return alumnoRepository.findAll();
    }

    public Optional<Alumno> getAlumno(Long id) {
        return alumnoRepository.findById(id);
    }

    public Alumno updateAlumno(Long id, Alumno alumno) {
        alumno.setAlumnoID(id);
        return alumnoRepository.save(alumno);
    }

    public void deleteAlumno(Long id){
        alumnoRepository.deleteById(id);
    }

}
