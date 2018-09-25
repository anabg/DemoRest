package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;
import com.example.demo.service.IPersonaService;

/**
 * PersonaController class
 * @author AGrimaut
 *
 */
@RestController
public class PersonaController {
	
	@Autowired
	private IPersonaService personaService;
	
	@GetMapping(value="/listar")
	public List<Persona> listar(){
		return personaService.listar();
	}
	
	@PostMapping(value="/registrar")
	public Persona registrar(@RequestBody Persona persona) {
		return personaService.registrar(persona);
	}
	
	@PutMapping(value="/modificar")
	public Persona modificar(Persona persona) {
		return personaService.modificar(persona);
	}
	
	@DeleteMapping(value="/eliminar")
	public int eliminar(int id) {
		return personaService.eliminar(id);
	}
	

}
