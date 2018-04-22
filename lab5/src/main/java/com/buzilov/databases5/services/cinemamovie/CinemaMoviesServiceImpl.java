package com.buzilov.databases5.services.cinemamovie;

import com.buzilov.databases5.model.CinemaMovie;
import com.buzilov.databases5.repositories.CinemaMoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaMoviesServiceImpl implements CinemaMoviesService {
    @Autowired
    CinemaMoviesRepository repository;

    @Override
    public CinemaMovie insert(CinemaMovie CinemaMovie) {
        return repository.save(CinemaMovie);
    }

    @Override
    public CinemaMovie update(CinemaMovie CinemaMovie) {
        return repository.save(CinemaMovie);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public CinemaMovie getById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<CinemaMovie> getAll() {
        return (List<CinemaMovie>)repository.findAll();
    }
}
