/**
 * 
 */
package com.devpredator.animes.repository;

import org.springframework.data.repository.CrudRepository;

import com.devpredator.animes.entity.Anime;

/**
 * @author DevPredator
 * @version 1.0 06/02/2021
 * Interface que contiene el CRUD con Spring JPA para la tabla de anime.
 */
public interface AnimesRepository extends CrudRepository<Anime, Long> {

}
