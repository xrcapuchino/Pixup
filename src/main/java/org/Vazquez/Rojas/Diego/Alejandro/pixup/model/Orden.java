package org.Vazquez.Rojas.Diego.Alejandro.pixup.model;

import java.sql.Timestamp;

public class Orden {
    private Integer Id;
    private Float costo_total;
    private Timestamp fecha;
    private Integer cantida_total;
    private String estatus_envio;
    private Float costo_envio;
    private Usuario id_usuario;

    public Orden() {
    }

    public Orden(Integer id, Float costo_total, Timestamp fecha, Integer cantida_total, String estatus_envio, Float costo_envio, Usuario id_usuario) {
        Id = id;
        this.costo_total = costo_total;
        this.fecha = fecha;
        this.cantida_total = cantida_total;
        this.estatus_envio = estatus_envio;
        this.costo_envio = costo_envio;
        this.id_usuario = id_usuario;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Float getCosto_total() {
        return costo_total;
    }

    public void setCosto_total(Float costo_total) {
        this.costo_total = costo_total;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public Integer getCantida_total() {
        return cantida_total;
    }

    public void setCantida_total(Integer cantida_total) {
        this.cantida_total = cantida_total;
    }

    public String getEstatus_envio() {
        return estatus_envio;
    }

    public void setEstatus_envio(String estatus_envio) {
        this.estatus_envio = estatus_envio;
    }

    public Float getCosto_envio() {
        return costo_envio;
    }

    public void setCosto_envio(Float costo_envio) {
        this.costo_envio = costo_envio;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }
}
