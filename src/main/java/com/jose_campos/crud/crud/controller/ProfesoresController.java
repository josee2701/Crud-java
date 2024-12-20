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

import com.jose_campos.crud.crud.entity.Profesores;
import com.jose_campos.crud.crud.service.ProfesoresService;


@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class ProfesoresController {

    private final ProfesoresService profesoresService;
    public ProfesoresController(ProfesoresService profesoresService) {
        this.profesoresService = profesoresService;
    }
    //CRUD
    @GetMapping("/profesor/")
    public List<Profesores> findAll() {
        return profesoresService.findAll();
    }
    @GetMapping("/profesor/{id}")
    public Profesores findById(@PathVariable("id") Integer id) {
        return profesoresService.findById(id);
    }
    @PostMapping("/profesor/")
    public Profesores save(@RequestBody Profesores profesor) {
        return profesoresService.save(profesor);
    }
    @PutMapping("/profesor/{id}")
    public Profesores update(@PathVariable("id") Integer id, @RequestBody Profesores profesor) {
        Profesores profesorActual = profesoresService.findById(id);
        profesorActual.setNombre(profesor.getNombre());
        return profesoresService.update(profesorActual);
    }
    @DeleteMapping("/profesor/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        profesoresService.deleteById(id);
    }
  
}
