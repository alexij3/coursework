package com.buzilov.databases5.repositories.artist;

import com.buzilov.databases5.model.Artist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends CrudRepository<Artist, Integer> {

}
