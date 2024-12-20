package com.jose_campos.crud.crud.service;

import java.util.List;

import com.jose_campos.crud.crud.entity.Notas;

public interface NotasService {
    List<Notas> findAll();
    Notas findById(Integer id);
    Notas save(Notas nota);
    void deleteById(Integer id);
    Notas update(Notas nota);
}
