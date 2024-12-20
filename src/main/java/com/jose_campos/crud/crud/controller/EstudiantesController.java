package com.jose_campos.crud.crud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jose_campos.crud.crud.entity.Estudiante;
import com.jose_campos.crud.crud.service.EstudianteService;




@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class EstudiantesController {

    private final EstudianteService estudiantesService;

    public EstudiantesController(EstudianteService estudiantesService) {
        this.estudiantesService = estudiantesService;
    }
    //CRUD

    // Listar todos los estudiantes
    @GetMapping("/estudiantes/")
    public List<Estudiante> findAll() {
        return estudiantesService.findAll();
    }
    
    // Detalle de un estudiante
    @GetMapping("/estudiantes/{id}/")
    public Estudiante findById(@PathVariable("id") Integer id) {
        return estudiantesService.findById(id);
    }

    // Crear un estudiante
    @PostMapping("/estudiantes/")
    public Estudiante save(@RequestBody Estudiante estudiante) {
        return estudiantesService.save(estudiante);
    }


    // Actualizar un estudiante
    @PutMapping("/estudiantes/{id}/")
    public Estudiante update(@PathVariable("id") Integer id, @RequestBody Estudiante estudiante) {
        Estudiante estudianteActual = estudiantesService.findById(id);
        estudianteActual.setNombre(estudiante.getNombre());
        return estudiantesService.update(estudianteActual);
    }

    // Eliminar un estudiante
    @DeleteMapping("/estudiantes/{id}/")
    public void deleteById(@PathVariable("id") Integer id) {
        estudiantesService.deleteById(id);
    }

}
