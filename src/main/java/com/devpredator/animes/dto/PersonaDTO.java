package com.devpredator.animes.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @author DevPredator
 * @version 1.0 27/05/2021
 */
@Data
@ToString
public class PersonaDTO {
	/**
	 * Usuario ingresado por la persona.
	 */
	private String usuario;
	/**
	 * Contraseña ingresada por la persona.
	 */
	private String password;
}
