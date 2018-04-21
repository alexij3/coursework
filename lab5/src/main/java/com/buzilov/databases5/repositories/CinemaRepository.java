package com.buzilov.databases5.repositories;

import com.buzilov.databases5.model.Cinema;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRepository extends CrudRepository<Cinema, Integer> {
}
