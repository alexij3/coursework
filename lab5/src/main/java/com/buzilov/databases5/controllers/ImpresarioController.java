package com.buzilov.databases5.controllers;

import com.buzilov.databases5.model.Impresario;
import com.buzilov.databases5.services.impresario.ImpresarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/impresario")
public class ImpresarioController {
    @Autowired
    ImpresarioServiceImpl service;

    @RequestMapping("/showAll")
    public List<Impresario> getAll() {
        return service.getAll();
    }

    @RequestMapping("/delete")
    public void delete(int id) {
        System.out.println("kek");
        service.delete(id);
    }

    @RequestMapping("/create")
    public Impresario create(String name){
        Impresario Impresario = new Impresario(name);
        return service.insert(Impresario);
    }

    @RequestMapping("/update")
    public Impresario update(@RequestParam("id") Integer id, @RequestBody Impresario Impresario){
        Impresario.setId(id);
        return service.update(Impresario);
    }
}
