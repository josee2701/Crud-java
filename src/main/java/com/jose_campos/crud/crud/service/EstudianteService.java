package com.jose_campos.crud.crud.service;

import java.util.List;

import com.jose_campos.crud.crud.entity.Estudiante;

public interface EstudianteService {
    List<Estudiante> findAll();
    Estudiante findById(Integer id);
    Estudiante save(Estudiante estudiante);
    void deleteById(Integer id);
    Estudiante update(Estudiante estudiante);

}
