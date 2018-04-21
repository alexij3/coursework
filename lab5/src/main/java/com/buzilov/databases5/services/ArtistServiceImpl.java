package com.buzilov.databases5.services;

import com.buzilov.databases5.model.Artist;
import com.buzilov.databases5.repositories.artist.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistServiceImpl implements ArtistService {
    @Autowired
    ArtistRepository artistRepository;

    @Override
    public Artist insert(Artist artist) {
        return artistRepository.save(artist);
    }

    @Override
    public Artist update(Artist artist) {
        return artistRepository.save(artist);
    }

    @Override
    public void delete(int id) {
        artistRepository.deleteById(id);
    }

    @Override
    public Artist getById(int id) {
        return artistRepository.findById(id).get();
    }

    @Override
    public List<Artist> getAll() {
        return (List<Artist>)artistRepository.findAll();
    }
}
