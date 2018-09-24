package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author AGrimaut
 *
 */
@Entity
@Table (name="persona")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPersona;
	private String nombre;
	private String apellido;
	private int edad;
	
	
	
	public Persona(int idPersona, String nombre, String apellido, int edad) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	/**
	 * gets ID Persona
	 * @return
	 */
	public int getIdPersona() {
		return idPersona;
	}
	
	/**
	 * Sets id persona
	 * @param idPersona
	 */
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	
	/**
	 * Gets Nombre
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Sets Nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Gets Apellido
	 * @return
	 */
	public String getApellido() {
		return apellido;
	}
	
	/**
	 * Sets Apellido
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	/**
	 * Gets Edad
	 * @return
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * Sets Edad
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
