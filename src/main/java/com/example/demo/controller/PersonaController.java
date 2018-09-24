package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;

@RestController
public class PersonaController {
	
	@GetMapping(value="/saludar")
	public List<Persona> saludar(){
		List<Persona> lista = new ArrayList<>();

		lista.add(new Persona(1, "aa", "bb", 2));
		lista.add(new Persona(1, "aa", "cc", 2));
		return lista;
	}

}
