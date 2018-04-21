package com.buzilov.databases5.services.concerthall;

import com.buzilov.databases5.model.ConcertHall;

import java.util.List;

public interface ConcertHallService {
    ConcertHall insert(ConcertHall ConcertHall);
    ConcertHall update(ConcertHall ConcertHall);
    void delete(int id);
    ConcertHall getById(int id);
    List<ConcertHall> getAll();
}
