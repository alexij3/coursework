package com.buzilov.databases5.services.cinema;

import com.buzilov.databases5.model.Cinema;
import com.buzilov.databases5.repositories.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaServiceImpl implements CinemaService {
    @Autowired
    CinemaRepository cinemaRepository;

    @Override
    public Cinema insert(Cinema Cinema) {
        return cinemaRepository.save(Cinema);
    }

    @Override
    public Cinema update(Cinema Cinema) {
        return cinemaRepository.save(Cinema);
    }

    @Override
    public void delete(int id) {
        cinemaRepository.deleteById(id);
    }

    @Override
    public Cinema getById(int id) {
        return cinemaRepository.findById(id).get();
    }

    @Override
    public List<Cinema> getAll() {
        return (List<Cinema>)cinemaRepository.findAll();
    }
}
