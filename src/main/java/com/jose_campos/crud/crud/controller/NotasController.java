package com.jose_campos.crud.crud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jose_campos.crud.crud.entity.Notas;
import com.jose_campos.crud.crud.service.NotasService;

@RestController
public class NotasController {
    
    private final NotasService notasService;

    public NotasController(NotasService notasService) {
        this.notasService = notasService;
    }
    //CRUD

    // Listar todas las notas
    @GetMapping("/notas/")
    public List<Notas> findAll() {
        return notasService.findAll();
    }

    // Detalle de una nota
    @GetMapping("/notas/{id}/")
    public Notas findById(@PathVariable("id") Integer id) {
        return notasService.findById(id);
    }

    // Crear una nota
    @PostMapping("/notas/")
    public Notas save(@RequestBody Notas nota) {
        return notasService.save(nota);
    }


    // Actualizar una nota
    @PutMapping("/notas/{id}/")
    public Notas update(@PathVariable("id") Integer id, @RequestBody Notas nota) {
        Notas notaActual = notasService.findById(id);
        notaActual.setEstudiante(nota.getEstudiante());
        notaActual.setProfesor(nota.getProfesor());
        notaActual.setNota1(nota.getNota1());
        notaActual.setDescription(nota.getDescription());
        return notasService.update(notaActual);
    }

    // Eliminar una nota
    @DeleteMapping("/notas/{id}/")
    public void deleteById(@PathVariable("id") Integer id) {
        notasService.deleteById(id);
    }
    

}
