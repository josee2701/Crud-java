package com.jose_campos.crud.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jose_campos.crud.crud.entity.Notas;
import com.jose_campos.crud.crud.repository.NotasRepository;

@Service
public class NotasServiceImpl implements NotasService {

    private final NotasRepository notasRepository;

    public NotasServiceImpl(NotasRepository notasRepository) {
        this.notasRepository = notasRepository;
    }
    @Override
    public List<Notas> findAll() {
        return notasRepository.findAll();
    }
    @Override
    public Notas findById(Integer id) {
        return notasRepository.findById(id).get();
    }
    @Override
    public Notas save(Notas notas) {
        return notasRepository.save(notas);
    }
    @Override
    public Notas update(Notas notas) {
        return notasRepository.save(notas);
    }
    @Override
    public void deleteById(Integer id) {
        notasRepository.deleteById(id);
    }

}
