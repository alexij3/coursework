package com.buzilov.databases5.services;

import com.buzilov.databases5.model.Artist;

import java.util.List;

public interface ArtistService {
    Artist insert(Artist artist);
    Artist update(Artist artist);
    void delete(int id);
    Artist getById(int id);
    List<Artist> getAll();
}
