package com.apicontrol.apicontrol.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbb_Administrativos")

public class Administrativo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long administrativoID;
    
    private Integer no_contro;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String correo;
    private String area;
    private String departamento;
    private String horario;
}
