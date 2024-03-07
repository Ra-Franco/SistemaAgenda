package org.example.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Evento {
    private String titulo;
    private LocalDate data;
    private String descricao;
    private LocalTime duracaoHoras;

    public Evento(String titulo, LocalDate data, String descricao, LocalTime duracaoHoras) {
        this.titulo = titulo;
        this.data = data;
        this.descricao = descricao;
        this.duracaoHoras = duracaoHoras;
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

    public LocalTime getDuracao() {
        return duracaoHoras;
    }

    public void setDuracao(LocalTime duracao) {
        this.duracaoHoras = duracao;
    }

    public String localTimeToString(){
        return this.duracaoHoras.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "Evento{" +
                "titulo='" + titulo + '\'' +
                ", data=" + data +
                ", descricao='" + descricao + '\'' +
                ", duração(Horas) =" + localTimeToString() +
                '}';
    }
}
