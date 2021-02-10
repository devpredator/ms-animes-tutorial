/**
 * 
 */
package com.devpredator.animes.service;

import com.devpredator.animes.entity.Persona;

/**
 * @author DevPredator
 * @version 1.0 27/05/2021
 */
public interface PersonaService {
	/**
	 * Metodo que permite consultar una persona por su usuario y password. 
	 * @param usuario {@link String} usuario ingresado.
	 * @param password {@link String} contraseña ingresada.
	 * @return {@link Persona} persona loggeada.
	 */
	Persona consultarPersona(String usuario, String password);
	
}
