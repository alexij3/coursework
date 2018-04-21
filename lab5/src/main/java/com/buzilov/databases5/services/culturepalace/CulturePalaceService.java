package com.buzilov.databases5.services.culturepalace;

import com.buzilov.databases5.model.CulturePalace;

import java.util.List;

public interface CulturePalaceService {
    CulturePalace insert(CulturePalace CulturePalace);
    CulturePalace update(CulturePalace CulturePalace);
    void delete(int id);
    CulturePalace getById(int id);
    List<CulturePalace> getAll();
}
