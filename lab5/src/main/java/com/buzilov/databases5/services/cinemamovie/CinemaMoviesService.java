package com.buzilov.databases5.services.cinemamovie;

import com.buzilov.databases5.model.CinemaMovie;

import java.util.List;

public interface CinemaMoviesService {
    CinemaMovie insert(CinemaMovie CinemaMovie);
    CinemaMovie update(CinemaMovie CinemaMovie);
    void delete(int id);
    CinemaMovie getById(int id);
    List<CinemaMovie> getAll();
}
