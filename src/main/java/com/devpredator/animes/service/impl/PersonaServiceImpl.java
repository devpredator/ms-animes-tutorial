/**
 * 
 */
package com.devpredator.animes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devpredator.animes.entity.Persona;
import com.devpredator.animes.repository.PersonaRepository;
import com.devpredator.animes.service.PersonaService;

/**
 * @author DevPredator
 * @version 1.0 27/05/2021
 */
@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaRepository personaRepository;
	
	@Override
	public Persona consultarPersona(String usuario, String password) {
		return this.personaRepository.findByUsuarioAndPassword(usuario, password);
	}

}
