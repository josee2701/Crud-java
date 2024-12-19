package com.jose_campos.crud.crud.service;

import java.util.List;

import com.jose_campos.crud.crud.entity.Profesores;

public interface ProfesoresService {
    List<Profesores> findAll();
    Profesores findById(Integer id);
    Profesores save(Profesores profesores);
    void deleteById(Integer id);
    Profesores update(Profesores profesores);
    

}
