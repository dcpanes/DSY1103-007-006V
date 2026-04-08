package com.solucion.etapas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Evento {
    private String id;
    private String nombre;
    private String tipoEvento;
    private int capacidad;
}
