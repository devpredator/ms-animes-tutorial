/**
 * 
 */
package com.devpredator.animes.repository;

import org.springframework.data.repository.CrudRepository;

import com.devpredator.animes.entity.Persona;

/**
 * @author DevPredator
 * @version 1.0 27/05/2021
 */
public interface PersonaRepository extends CrudRepository<Persona, Long> {
	/**
	 * Servicio del CRUD que permite consultar una persona por usuario y contraseña.
	 * @param usuario {@link String} usuario ingresado.
	 * @param password {@link String} contraseña ingresada.
	 * @return {@link Persona} persona loggeada.
	 */
	Persona findByUsuarioAndPassword(String usuario, String password);
}
