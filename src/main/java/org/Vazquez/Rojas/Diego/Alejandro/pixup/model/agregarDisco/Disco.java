package org.Vazquez.Rojas.Diego.Alejandro.pixup.model.agregarDisco;

import java.util.Date;

public class Disco {
    private Integer Id;
    private String titulo;
    private Float precio;
    private Integer existencia;
    private Float descuento;
    private Date fecha_lanzamiento;
    private String imagen;
    private Disquera id_disquera;
    private Artista id_artista;
    private Genero_musical id_genero_musical;

    public Disco() {
    }

    public Disco(Integer id, String titulo, Float precio, Integer existencia, Float descuento, Date fecha_lanzamiento, String imagen, Disquera id_disquera, Artista id_artista, Genero_musical id_genero_musical) {
        Id = id;
        this.titulo = titulo;
        this.precio = precio;
        this.existencia = existencia;
        this.descuento = descuento;
        this.fecha_lanzamiento = fecha_lanzamiento;
        this.imagen = imagen;
        this.id_disquera = id_disquera;
        this.id_artista = id_artista;
        this.id_genero_musical = id_genero_musical;
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

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }

    public Float getDescuento() {
        return descuento;
    }

    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }

    public Date getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(Date fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Disquera getId_disquera() {
        return id_disquera;
    }

    public void setId_disquera(Disquera id_disquera) {
        this.id_disquera = id_disquera;
    }

    public Artista getId_artista() {
        return id_artista;
    }

    public void setId_artista(Artista id_artista) {
        this.id_artista = id_artista;
    }

    public Genero_musical getId_genero_musical() {
        return id_genero_musical;
    }

    public void setId_genero_musical(Genero_musical id_genero_musical) {
        this.id_genero_musical = id_genero_musical;
    }
}
