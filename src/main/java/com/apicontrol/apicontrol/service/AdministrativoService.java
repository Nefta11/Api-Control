package com.apicontrol.apicontrol.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apicontrol.apicontrol.entity.Administrativo;
import com.apicontrol.apicontrol.repository.AdministrativoRepository;

@Service
public class AdministrativoService {
    @Autowired
    private AdministrativoRepository administrativoRepository;

    public Administrativo saveAdministrativo(Administrativo administrativo){
        return administrativoRepository.save(administrativo);
    }

    public List<Administrativo> getAllAdministrativos(){
        return administrativoRepository.findAll();
    }
    
    public Optional<Administrativo> getAdministrativo(Long id){
        return administrativoRepository.findById(id);
    }

    public Administrativo updateAdministrativo(Long id, Administrativo administrativo){
        administrativo.setAdministrativoID(id);
        return administrativoRepository.save(administrativo);
    }

    public void deleteAdministrativo(Long id){
        administrativoRepository.deleteById(id);
    }

}
