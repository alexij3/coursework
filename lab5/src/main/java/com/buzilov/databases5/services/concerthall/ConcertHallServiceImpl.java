package com.buzilov.databases5.services.concerthall;

import com.buzilov.databases5.model.ConcertHall;
import com.buzilov.databases5.repositories.ConcertHallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConcertHallServiceImpl implements ConcertHallService {
    @Autowired
    ConcertHallRepository repository;

    @Override
    public ConcertHall insert(ConcertHall ConcertHall) {
        return repository.save(ConcertHall);
    }

    @Override
    public ConcertHall update(ConcertHall ConcertHall) {
        return repository.save(ConcertHall);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public ConcertHall getById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<ConcertHall> getAll() {
        return (List<ConcertHall>)repository.findAll();
    }
}
