package com.buzilov.databases5.services.theatre;

import com.buzilov.databases5.model.Theatre;

import java.util.List;

public interface TheatreService {
    Theatre insert(Theatre Theatre);
    Theatre update(Theatre Theatre);
    void delete(int id);
    Theatre getById(int id);
    List<Theatre> getAll();
}
