package com.buzilov.databases5.controllers;

import com.buzilov.databases5.model.Artist;
import com.buzilov.databases5.services.artist.ArtistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/artist")
public class ArtistController {
    @Autowired
    ArtistServiceImpl service;

    @RequestMapping("/showAll")
    public List<Artist> getAll() {
        return service.getAll();
    }

    @RequestMapping("/delete")
    public void delete(int id) {
        System.out.println("kek");
        service.delete(id);
    }

    @RequestMapping("/create")
    public Artist create(String name){
        Artist artist = new Artist(name);
        return service.insert(artist);
    }

    @RequestMapping("/update")
    public Artist update(@RequestParam("id") Integer id, @RequestBody Artist artist){
        artist.setId(id);
        return service.update(artist);
    }

}
