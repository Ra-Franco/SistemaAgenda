package org.example.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Evento {
    private String titulo;
    private LocalDate data;
    private String descricao;
    private LocalTime horaInicio;
    private LocalTime horaFim;
    private long diferenca;

    public Evento(String titulo, LocalDate data, String descricao, LocalTime horaInicio, LocalTime horaFim) {
        this.titulo = titulo;
        this.data = data;
        this.descricao = descricao;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(LocalTime horaFim) {
        this.horaFim = horaFim;
    }

    public long getDiferenca(){
        return ChronoUnit.HOURS.between(horaInicio, horaFim);
    }

    @Override
    public String toString() {
        return "Evento{" +
                "titulo='" + titulo + '\'' +
                ", data=" + data +
                ", descricao='" + descricao + '\'' +
                ", duração(Horas) =" + getDiferenca() +
                '}';
    }
}
