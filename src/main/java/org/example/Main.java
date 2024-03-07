package org.example;

import org.example.model.Agenda;
import org.example.model.Evento;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate data3 = LocalDate.of(2024,3,9);
        LocalDate data2 = LocalDate.of(2024,3,8);
        LocalDate data = LocalDate.of(2024,3,6);
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.now().minusHours(1).minusMinutes(28);
        Agenda agenda = new Agenda(data);


        // Criando alguns eventos
        Evento evento1 = new Evento("Reunião de equipe", data3, "Discussão de novos projetos", localTime, localTime1);
        Evento evento2 = new Evento("Aniversário", data2, "Festa de aniversário do João",localTime,localTime1);
        Evento evento3 = new Evento("Consulta médica", data, "Check-up anual",localTime,localTime1);

        // Adicionando os eventos à agenda
        agenda.adicionarEventos(evento1);
        agenda.adicionarEventos(evento2);
        agenda.adicionarEventos(evento3);

        // Visualizando eventos do dia
        List<Evento> eventosDoDia = agenda.getEventosDoDia(data);
        System.out.println("Eventos do dia:");
        for (Evento evento : eventosDoDia) {
            System.out.println(evento);
        }
        System.out.println("HashMap");
        HashMap<LocalDate,List<Evento>> eventosDoMes = agenda.getEventosMes(3,2024);
//        System.out.println("Print");
//        System.out.println(eventosDoMes);
//        System.out.println("For");
        for (Map.Entry<LocalDate, List<Evento>> map : eventosDoMes.entrySet()){
            System.out.println(map.getKey());
            System.out.println(map.getValue());
        }

    }
}