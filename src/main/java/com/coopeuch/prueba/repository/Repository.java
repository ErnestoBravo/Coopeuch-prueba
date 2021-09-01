package com.coopeuch.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coopeuch.prueba.model.Tarea;

public interface Repository extends JpaRepository<Tarea, Integer>{

}
