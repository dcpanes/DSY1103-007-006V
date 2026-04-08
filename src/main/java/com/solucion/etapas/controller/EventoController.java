package com.solucion.etapas.controller;

import com.solucion.etapas.model.Evento;
import com.solucion.etapas.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @PostMapping("/eventos")
    public Evento create(@RequestBody Evento evento){
        return eventoService.create(evento);
    }

    @GetMapping("/eventos")
    public List<Evento> findAll(){
        return eventoService.findAll();
    }

    @GetMapping("/eventos/{id}")
    public Evento findById(@PathVariable String id) {
        return eventoService.findById(id);
    }

    @DeleteMapping("/eventos/{id}")
    public String delete(@PathVariable String id) {
        return eventoService.delete(id);
    }

    @PutMapping("/eventos/{id}")
    public Evento update(@PathVariable String id, @RequestBody Evento nuevoEvento) {
        return eventoService.update(id, nuevoEvento);
    }

}
