package com.buzilov.databases5.controllers;

import com.buzilov.databases5.model.Organizer;
import com.buzilov.databases5.services.organizer.OrganizerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/organizer")
public class OrganizerController {
    @Autowired
    OrganizerServiceImpl service;

    @RequestMapping("/showAll")
    public List<Organizer> getAll() {
        return service.getAll();
    }

    @RequestMapping("/delete")
    public void delete(int id) {
        System.out.println("kek");
        service.delete(id);
    }

    @RequestMapping("/create")
    public Organizer create(String name){
        Organizer organizer = new Organizer(name);
        return service.insert(organizer);
    }

    @RequestMapping("/update")
    public Organizer update(@RequestParam("id") Integer id, @RequestBody Organizer organizer){
        organizer.setId(id);
        return service.update(organizer);
    }
}
