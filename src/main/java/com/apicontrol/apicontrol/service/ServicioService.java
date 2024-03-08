package com.apicontrol.apicontrol.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apicontrol.apicontrol.entity.Servicio;
import com.apicontrol.apicontrol.repository.ServicioRepository;

@Service
public class ServicioService {
    
    @Autowired
    private ServicioRepository servicioRepository;

    public Servicio saveServicio(Servicio servicio){
        return servicioRepository.save(servicio);
    }

    public List<Servicio> getAllServicios(){
     return servicioRepository.findAll();   
    }

    public Optional<Servicio> getServicio(Long id){
        return servicioRepository.findById(id);
    }

    public Servicio updatServicio(Long id, Servicio servicio){
        servicio.setServicioID(id);
        return servicioRepository.save(servicio);
    }

    public void deleteServicio(Long id){
        servicioRepository.deleteById(id);
    }
}
