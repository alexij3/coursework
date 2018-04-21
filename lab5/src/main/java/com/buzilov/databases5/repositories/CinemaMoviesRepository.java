package com.buzilov.databases5.repositories;

import com.buzilov.databases5.model.CinemaMovie;
import org.springframework.data.repository.CrudRepository;

public interface CinemaMoviesRepository extends CrudRepository<CinemaMovie, Integer> {
}
