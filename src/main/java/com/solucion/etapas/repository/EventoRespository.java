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
}
