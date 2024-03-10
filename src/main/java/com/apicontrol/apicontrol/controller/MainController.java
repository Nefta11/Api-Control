package com.apicontrol.apicontrol.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apicontrol.apicontrol.entity.Alumno;
import com.apicontrol.apicontrol.entity.Docente;
import com.apicontrol.apicontrol.service.AdministrativoService;
import com.apicontrol.apicontrol.service.AlumnoService;
import com.apicontrol.apicontrol.service.DocenteService;

@RestController
@RequestMapping(path = "/apicontroler/v1")
public class MainController {

    @Autowired
    private AlumnoService alumnoService;
    @Autowired
    private DocenteService docenteService;
    @Autowired
    private AdministrativoService administrativoService;

    @GetMapping("/Alumnos")
    public List<Map<String, Object>> getAllAlumnosPartial() {
        List<Alumno> alumnos = alumnoService.getAllAlumnos();
        List<Map<String, Object>> alumnosPartial = new ArrayList<>();

        for (Alumno alumno : alumnos) {
            Map<String, Object> alumnoPartial = new LinkedHashMap<>();
            alumnoPartial.put("matricula", alumno.getMatricula());
            alumnoPartial.put("nombre", alumno.getNombre());
            alumnoPartial.put("apellidoPaterno", alumno.getApellidoPaterno());
            alumnoPartial.put("apellidoMaterno", alumno.getApellidoMaterno());
            alumnosPartial.add(alumnoPartial);
        }

        return alumnosPartial;
    }

        @GetMapping("/Docentes")
    public List<Map<String, Object>> getAllDocentesPartial() {
        List<Docente> docentes = docenteService.getAllDocentes();
        List<Map<String, Object>> docentesPartial = new ArrayList<>();

        for (Docente docente : docentes) {
            Map<String, Object> docentePartial = new LinkedHashMap<>();
            docentePartial.put("noContro", docente.getNoContro());
            docentePartial.put("nombre", docente.getNombre());
            docentePartial.put("apellidoPaterno", docente.getApellidoPaterno());
            docentePartial.put("apellidoMaterno", docente.getApellidoMaterno());
            docentesPartial.add(docentePartial);
        }

        return docentesPartial;
    }
}
