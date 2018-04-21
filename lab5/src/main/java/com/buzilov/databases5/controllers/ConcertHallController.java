package com.buzilov.databases5.controllers;

import com.buzilov.databases5.model.ConcertHall;
import com.buzilov.databases5.model.ConcertHall;
import com.buzilov.databases5.services.concerthall.ConcertHallServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/concerthall")
public class ConcertHallController {
    @Autowired
    ConcertHallServiceImpl service;

    @RequestMapping("/showAll")
    public List<ConcertHall> getAll() {
        return service.getAll();
    }

    @RequestMapping("/delete")
    public void delete(int id) {
        System.out.println("kek");
        service.delete(id);
    }

    @RequestMapping("/create")
    public ConcertHall create(@RequestBody ConcertHall ConcertHall){
        return service.insert(ConcertHall);
    }

    @RequestMapping("/update")
    public ConcertHall update(@RequestParam("id") Integer id, @RequestBody ConcertHall ConcertHall){
        ConcertHall.setId(id);
        return service.update(ConcertHall);
    }

}
