package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Persona;

public interface IPersonaService {

	Persona registrar( Persona pe );
	Persona modificar( Persona pe );
	int eliminar( int id );
	List<Persona> listar();
	Persona listarId( Integer id );
	
	
}
