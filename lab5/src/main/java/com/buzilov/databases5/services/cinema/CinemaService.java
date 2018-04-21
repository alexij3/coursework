package com.buzilov.databases5.services.cinema;

import com.buzilov.databases5.model.Cinema;

import java.util.List;

public interface CinemaService {
    Cinema insert(Cinema Cinema);
    Cinema update(Cinema Cinema);
    void delete(int id);
    Cinema getById(int id);
    List<Cinema> getAll();
}
