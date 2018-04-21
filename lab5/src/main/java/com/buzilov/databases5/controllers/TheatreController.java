package com.buzilov.databases5.controllers;

import com.buzilov.databases5.model.Theatre;
import com.buzilov.databases5.services.theatre.TheatreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/theatre")
public class TheatreController {
    @Autowired
    TheatreServiceImpl service;

    @RequestMapping("/showAll")
    public List<Theatre> getAll() {
        return service.getAll();
    }

    @RequestMapping("/delete")
    public void delete(int id) {
        System.out.println("kek");
        service.delete(id);
    }

    @RequestMapping("/create")
    public Theatre create(@RequestBody Theatre Theatre){
        return service.insert(Theatre);
    }

    @RequestMapping("/update")
    public Theatre update(@RequestParam("id") Integer id, @RequestBody Theatre Theatre){
        Theatre.setId(id);
        return service.update(Theatre);
    }
}
