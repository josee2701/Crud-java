package com.jose_campos.crud.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jose_campos.crud.crud.entity.Profesores;
import com.jose_campos.crud.crud.repository.ProfesoresRepository;

@Service
public class ProfesoresServicelmpl implements ProfesoresService {

    private final ProfesoresRepository profesoresRepository;

    public ProfesoresServicelmpl(ProfesoresRepository profesoresRepository) {
        this.profesoresRepository = profesoresRepository;
    }

    @Override
    public List<Profesores> findAll() {
        return profesoresRepository.findAll();
    }

    @Override
    public Profesores findById(Integer id) {
        return profesoresRepository.findById(id).get();
    }

    @Override
    public Profesores save(Profesores profesores) {
        return profesoresRepository.save(profesores);
    }

    @Override
    public Profesores update(Profesores profesores) {
        return profesoresRepository.save(profesores);
    }

    @Override
    public void deleteById(Integer id) {
        profesoresRepository.deleteById(id);
    }

}
