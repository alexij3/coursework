package com.buzilov.databases5.controllers;

import com.buzilov.databases5.model.CulturePalace;
import com.buzilov.databases5.services.culturepalace.CulturePalaceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/culturepalace")
public class CulturePalaceController {
    @Autowired
    CulturePalaceServiceImpl service;

    @RequestMapping("/showAll")
    public List<CulturePalace> getAll() {
        return service.getAll();
    }

    @RequestMapping("/delete")
    public void delete(int id) {
        System.out.println("kek");
        service.delete(id);
    }

    @RequestMapping("/create")
    public CulturePalace create(@RequestBody CulturePalace CulturePalace){
        return service.insert(CulturePalace);
    }

    @RequestMapping("/update")
    public CulturePalace update(@RequestParam("id") Integer id, @RequestBody CulturePalace CulturePalace){
        CulturePalace.setId(id);
        return service.update(CulturePalace);
    }

}
