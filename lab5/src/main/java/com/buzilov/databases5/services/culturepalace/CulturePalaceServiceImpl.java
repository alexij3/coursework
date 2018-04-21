package com.buzilov.databases5.services.culturepalace;

import com.buzilov.databases5.model.CulturePalace;
import com.buzilov.databases5.repositories.CulturePalaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CulturePalaceServiceImpl implements CulturePalaceService{
    @Autowired
    CulturePalaceRepository repository;

    @Override
    public CulturePalace insert(CulturePalace CulturePalace) {
        return repository.save(CulturePalace);
    }

    @Override
    public CulturePalace update(CulturePalace CulturePalace) {
        return repository.save(CulturePalace);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public CulturePalace getById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<CulturePalace> getAll() {
        return (List<CulturePalace>)repository.findAll();
    }

}
