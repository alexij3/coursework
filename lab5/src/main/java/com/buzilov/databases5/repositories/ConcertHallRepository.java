package com.buzilov.databases5.repositories;

import com.buzilov.databases5.model.ConcertHall;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcertHallRepository extends CrudRepository<ConcertHall, Integer>{
}
