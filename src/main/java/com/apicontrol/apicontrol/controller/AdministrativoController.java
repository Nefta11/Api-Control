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

import com.apicontrol.apicontrol.entity.Administrativo;
import com.apicontrol.apicontrol.service.AdministrativoService;

@RestController
@RequestMapping(path = "/Api/Administrativos")
public class AdministrativoController {

    @Autowired
    private AdministrativoService administrativoService;

    @PostMapping
    private Administrativo save(@RequestBody Administrativo administrativo){
        return administrativoService.saveAdministrativo(administrativo);
    }

    @GetMapping
    public List<Administrativo> getAllAdministrativos(){
     return administrativoService.getAllAdministrativos();   
    }

    @GetMapping("/{administrativoID}")
    public Optional<Administrativo> getBId(@PathVariable("administrativoID") Long administrativoID){
        return administrativoService.getAdministrativo(administrativoID);
    }

    @PutMapping("/{administrativoID}")
        public Administrativo upAdministrativo(@PathVariable Long administrativoID, @RequestBody Administrativo administrativo){
            return administrativoService.updateAdministrativo(administrativoID, administrativo);
        }

        @DeleteMapping("/{administrativoID}")
        public String deleteAdministrativo(@PathVariable ("administrativoID") Long administrativoID){
            administrativoService.deleteAdministrativo(administrativoID);
                return "Eliminado Exitosamente";
            
        }
    }
    

