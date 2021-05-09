package com.pruebas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebas.models.Persona;

public interface PersonaDAO  extends JpaRepository<Persona, Integer>{

}
