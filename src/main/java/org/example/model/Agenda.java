package org.example.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Agenda {
    private Map<LocalDate,List<Evento>> eventos;
    private LocalDate dataAgenda;

    public Agenda(LocalDate dataAgenda) {
        this.dataAgenda = dataAgenda;
        this.eventos = new HashMap<>();
    }

    public LocalDate getDataAgenda() {
        return dataAgenda;
    }

    public void adicionarEventos(Evento evento){
        LocalDate dataEvento = evento.getData();
        if(!eventos.containsKey(dataEvento)){
            eventos.put(dataEvento, new ArrayList<>());
        }
        eventos.get(dataEvento).add(evento);
    }

    public List<Evento> getEventosDoDia(LocalDate data) {
        return eventos.getOrDefault(data, new ArrayList<>());
    }

    public HashMap<LocalDate, List<Evento>> getEventosMes(Integer mes, Integer ano){
        HashMap<LocalDate, List<Evento>> eventosMes = new HashMap<>();
        for (Map.Entry<LocalDate, List<Evento>> map : eventos.entrySet()){
            if (map.getKey().getMonthValue() == mes && map.getKey().getYear() == ano){

                eventosMes.put(map.getKey(), map.getValue());
            }
        }
        return eventosMes;
    }
}
