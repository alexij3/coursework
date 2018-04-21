package com.buzilov.databases5.controllers;

import com.buzilov.databases5.model.Cinema;
import com.buzilov.databases5.services.cinema.CinemaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cinema")
public class CinemaController {
    @Autowired
    CinemaServiceImpl service;

    @RequestMapping("/showAll")
    public List<Cinema> getAll() {
        return service.getAll();
    }

    @RequestMapping("/delete")
    public void delete(int id) {
        System.out.println("kek");
        service.delete(id);
    }

    @RequestMapping("/create")
    public Cinema create(@RequestBody Cinema cinema){
        return service.insert(cinema);
    }

    @RequestMapping("/update")
    public Cinema update(@RequestParam("id") Integer id, @RequestBody Cinema Cinema){
        Cinema.setId(id);
        return service.update(Cinema);
    }
}
