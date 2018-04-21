package com.buzilov.databases5.services.organizer;

import com.buzilov.databases5.model.Organizer;

import java.util.List;

public interface OrganizerService {
    Organizer insert(Organizer artist);
    Organizer update(Organizer artist);
    void delete(int id);
    Organizer getById(int id);
    List<Organizer> getAll();
}
