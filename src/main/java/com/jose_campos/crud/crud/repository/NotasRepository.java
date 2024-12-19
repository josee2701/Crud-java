package com.jose_campos.crud.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jose_campos.crud.crud.entity.Notas;

@Repository
public interface NotasRepository extends JpaRepository<Notas, Integer> {

}
