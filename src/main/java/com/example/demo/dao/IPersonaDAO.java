package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Persona;

/**
 * IPersonaDAO interface
 * @author AGrimaut
 *
 */
public interface IPersonaDAO extends JpaRepository<Persona, Integer>{

}
