package com.solucion.etapas.service;

import com.solucion.etapas.model.Evento;
import com.solucion.etapas.repository.EventoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {

    @Autowired
    private EventoRespository eventoRespository;

    public List<Evento> findAll(){
        return eventoRespository.findAll();
    }

    public Evento create(Evento evento){
        return eventoRespository.create(evento);
    }

    public String delete(String id){
        return eventoRespository.delete(id) ? "Evento eliminado" : "Evento no encontrado";
    }

    public Evento findById(String id){
        return eventoRespository.findById(id);
    }

    public Evento update(String id, Evento nuevoEvento){
        return eventoRespository.update(id, nuevoEvento);
    }
}
