package com.solucion.etapas.repository;

import com.solucion.etapas.model.Evento;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EventoRespository {
    private List<Evento> eventos = new ArrayList<>();

    public List<Evento> findAll(){
        return eventos;
    }

    public Evento create(Evento evento){
        eventos.add(evento);
        return evento;
    }

    public boolean delete(String id){
        return eventos.removeIf(evento -> evento.getId().equals(id));
    }

    public Evento findById(String id){
        return eventos.stream()
                .filter(evento -> evento.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Evento update(String id, Evento nuevoEvento){
        Evento existeEvento = findById(id);
        if(existeEvento != null){
            existeEvento.setTipoEvento(nuevoEvento.getTipoEvento());
            existeEvento.setCapacidad(nuevoEvento.getCapacidad());
            existeEvento.setNombre(nuevoEvento.getNombre());
            return existeEvento;
        }
        return null;
    }
}
