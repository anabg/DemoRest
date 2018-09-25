package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPersonaDAO;
import com.example.demo.model.Persona;
import com.example.demo.service.IPersonaService;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaDAO personaDAO;

	@Override
	public Persona registrar(Persona pe) {
		return personaDAO.save(pe);
	}

	@Override
	public Persona modificar(Persona pe) {
		return personaDAO.save(pe);
	}

	@Override
	public int eliminar(int id) {
		personaDAO.delete(id);
		return 1;
	}

	@Override
	public List<Persona> listar() {
		return personaDAO.findAll();
	}

	@Override
	public Persona listarId(Integer id) {
		return personaDAO.findOne(id);
	}

}
