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

import com.apicontrol.apicontrol.entity.Docente;
import com.apicontrol.apicontrol.service.DocenteService;

@RestController
@RequestMapping(path = "/Api/Docentes")
public class DocenteController {
    

    @Autowired
    private DocenteService docenteService;

    @PostMapping
    public Docente save(@RequestBody Docente docente){
        return docenteService.saveDocente(docente);
    }

    @GetMapping
    public List<Docente> getAllDocentes(){
        return docenteService.getAllDocentes();
    }

    @GetMapping("/{docenteID}")
    public Optional<Docente> getBId(@PathVariable("docenteID") Long docenteID){
        return docenteService.getDocente(docenteID);
    }

    @PutMapping("/{docenteID}")
    public Docente updateDocente(@PathVariable Long docenteID, @RequestBody Docente docente){
        return docenteService.updaDocente(docenteID, docente);
    }

    @DeleteMapping("/{docenteID}")
    public String deleteDocente(@PathVariable("docenteID") Long docenteID){
        docenteService.deleteDocente(docenteID);
        return "Eliminado exitosamente";
    }

}
