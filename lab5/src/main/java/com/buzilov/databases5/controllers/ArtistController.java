package com.buzilov.databases5.controllers;

import com.buzilov.databases5.model.Artist;
import com.buzilov.databases5.model.Genre;
import com.buzilov.databases5.model.Impresario;
import com.buzilov.databases5.services.artist.ArtistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

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
        service.delete(id);
    }

    @RequestMapping("/create")
    public Artist create(@RequestBody Artist artist){
        System.out.println("Created artist");
        return service.insert(artist);
    }

    @RequestMapping("/update")
    public Artist update(@RequestParam("id") Integer id, @RequestBody Artist artist){
        artist.setId(id);
        return service.update(artist);
    }

}
