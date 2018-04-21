package com.buzilov.databases5.services.organizer;

import com.buzilov.databases5.model.Organizer;
import com.buzilov.databases5.repositories.OrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizerServiceImpl implements OrganizerService {
    @Autowired
    OrganizerRepository repository;

    @Override
    public Organizer insert(Organizer organizer) {
        return repository.save(organizer);
    }

    @Override
    public Organizer update(Organizer organizer) {
        return repository.save(organizer);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public Organizer getById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Organizer> getAll() {
        return (List<Organizer>)repository.findAll();
    }
}
