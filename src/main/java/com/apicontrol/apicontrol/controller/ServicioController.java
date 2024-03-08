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

import com.apicontrol.apicontrol.entity.Servicio;
import com.apicontrol.apicontrol.service.ServicioService;

@RestController
@RequestMapping(path = "/Api/Servicios")
public class ServicioController {
    
    @Autowired
    private ServicioService servicioService;

    @PostMapping 
    public Servicio save(@RequestBody Servicio servicio){
        return servicioService.saveServicio(servicio);
    }

    @GetMapping
    public List<Servicio> getAllServicios(){
        return servicioService.getAllServicios();
    }

    @GetMapping("/{servicioID}")
    public Optional<Servicio> getBId(@PathVariable("servicioID")Long servicioID){
        return servicioService.getServicio(servicioID);
    }

    @PutMapping("/{servicioID}")
    public Servicio updateServicio(@PathVariable Long servicioID, @RequestBody Servicio servicio){
        return servicioService.updatServicio(servicioID, servicio);
    }

    @DeleteMapping("/{servicioID}")
    public String deleteServicio(@PathVariable("servicioID") Long servicioID){
        servicioService.deleteServicio(servicioID);
        return "Eliminado exitosamente";
    }

}

