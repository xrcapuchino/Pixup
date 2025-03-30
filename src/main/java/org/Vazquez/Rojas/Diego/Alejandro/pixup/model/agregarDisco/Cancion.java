package org.Vazquez.Rojas.Diego.Alejandro.pixup.model.agregarDisco;

import java.sql.Time;

public class Cancion {
    private Integer Id;
    private String titulo;
    private Time duracion;
    private Disco id_disco;

    public Cancion() {
    }

    public Cancion(Integer id, String titulo, Time duracion, Disco id_disco) {
        Id = id;
        this.titulo = titulo;
        this.duracion = duracion;
        this.id_disco = id_disco;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Time getDuracion() {
        return duracion;
    }

    public void setDuracion(Time duracion) {
        this.duracion = duracion;
    }

    public Disco getId_disco() {
        return id_disco;
    }

    public void setId_disco(Disco id_disco) {
        this.id_disco = id_disco;
    }
}

