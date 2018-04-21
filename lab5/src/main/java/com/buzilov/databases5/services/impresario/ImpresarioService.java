package com.buzilov.databases5.services.impresario;

import com.buzilov.databases5.model.Impresario;

import java.util.List;

public interface ImpresarioService {
    Impresario insert(Impresario impresario);
    Impresario getById(int id);
    Impresario update(Impresario impresario);
    void delete(int id);
    List<Impresario> getAll();
}
