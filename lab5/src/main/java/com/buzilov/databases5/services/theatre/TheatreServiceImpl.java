package com.buzilov.databases5.services.theatre;

import com.buzilov.databases5.model.Theatre;
import com.buzilov.databases5.repositories.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreServiceImpl implements TheatreService{
    @Autowired
    TheatreRepository repository;

    @Override
    public Theatre insert(Theatre Theatre) {
        return repository.save(Theatre);
    }

    @Override
    public Theatre update(Theatre Theatre) {
        return repository.save(Theatre);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public Theatre getById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Theatre> getAll() {
        return (List<Theatre>)repository.findAll();
    }

}
