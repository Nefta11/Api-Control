package com.apicontrol.apicontrol.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbb_Servicios")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long servicioID;
    private Integer no_servicio;
    private String nombre;
    private String edifico;
    private String encargado;
    private String horario;
    
}
