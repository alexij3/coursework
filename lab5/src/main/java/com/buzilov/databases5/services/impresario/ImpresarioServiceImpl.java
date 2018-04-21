package com.buzilov.databases5.services.impresario;

import com.buzilov.databases5.model.Impresario;
import com.buzilov.databases5.repositories.impresario.ImpresarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpresarioServiceImpl implements ImpresarioService {
    @Autowired
    ImpresarioRepository repository;

    @Override
    public Impresario insert(Impresario impresario) {
        return repository.save(impresario)
    }

    @Override
    public Impresario getById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public Impresario update(Impresario impresario) {
        return repository.save(impresario);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public List<Impresario> getAll() {
        return (List<Impresario>)repository.findAll();
    }
}
