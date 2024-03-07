package com.apicontrol.apicontrol.service;

import java.util.Optional;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apicontrol.apicontrol.entity.Alumno;
import com.apicontrol.apicontrol.repository.alumnoRepository;

@Service
public class alumnoService {
    @Autowired
    private alumnoRepository alumnoRepository;

    public Alumno saveAlumno(Alumno alumno){
    return alumnoRepository.save(alumno);
    }

    public java.util.List<Alumno> getAllAlumnos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllAlumnos'");
    }

    public Optional<Alumno> getAlumno(Long alumnoID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAlumno'");
    }

    public Alumno updateAlumno(Long alumnoID, Alumno alumno) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAlumno'");
    }

}

