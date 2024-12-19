package com.jose_campos.crud.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jose_campos.crud.crud.entity.Estudiante;
import com.jose_campos.crud.crud.repository.EstudianteRepository;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    private final EstudianteRepository estudianteRepository;

    public EstudianteServiceImpl(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public List<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante findById(Integer id) {
        return estudianteRepository.findById(id).orElse(null);
    }

    @Override
    public Estudiante save(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public Estudiante update(Estudiante estudiante) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

}
