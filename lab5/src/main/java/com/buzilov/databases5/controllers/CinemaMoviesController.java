package com.buzilov.databases5.controllers;

import com.buzilov.databases5.model.CinemaMovie;
import com.buzilov.databases5.services.cinemamovie.CinemaMoviesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/cinemamovie")
public class CinemaMoviesController {
    @Autowired
    CinemaMoviesServiceImpl service;

    @RequestMapping("/showAll")
    public List<CinemaMovie> getAll() {
        return service.getAll();
    }

    @RequestMapping("/delete")
    public void delete(int id) {
        service.delete(id);
    }

    @RequestMapping("/create")
    public CinemaMovie create(@RequestBody CinemaMovie CinemaMovie){
        if (CinemaMovie.getDate() == null){
            CinemaMovie.setDate(LocalDate.of(2018, 1, 1));
        }
        return service.insert(CinemaMovie);
    }

    @RequestMapping("/update")
    public CinemaMovie update(@RequestParam("id") Integer id, @RequestBody CinemaMovie CinemaMovie){
        CinemaMovie.setId(id);
        if (CinemaMovie.getDate() == null){
            CinemaMovie.setDate(LocalDate.of(2018, 1, 1));
        }
        return service.update(CinemaMovie);
    }

}
