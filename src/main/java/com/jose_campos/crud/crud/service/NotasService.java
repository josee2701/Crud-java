package com.jose_campos.crud.crud.service;

import java.util.List;

import com.jose_campos.crud.crud.entity.Notas;

public interface NotasService {
    List<Notas> getAllNotas();
    Notas getNotaById(Integer id);
    Notas saveNota(Notas nota);
    void deleteNotaById(Integer id);
    Notas updateNota(Notas nota);
    

}
