package com.apicontrol.apicontrol.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apicontrol.apicontrol.entity.Docente;
import com.apicontrol.apicontrol.repository.DocenteRepository;

@Service
public class DocenteService {

    @Autowired
    private DocenteRepository docenteRepository;

    public Docente saveDocente(Docente docente) {
        return docenteRepository.save(docente);
    }

    public List<Docente> getAllDocentes() {
        return docenteRepository.findAll();
    }

    public Optional<Docente> getDocente(Long id){
        return docenteRepository.findById(id);
    }

    public Docente updaDocente(Long id, Docente docente){
        docente.setDocenteID(id);
        return docenteRepository.save(docente);
    }


    public void deleteDocente(Long id){
        docenteRepository.deleteById(id);
    }
}
