package org.Vazquez.Rojas.Diego.Alejandro.pixup.model.crearOrden;

import org.Vazquez.Rojas.Diego.Alejandro.pixup.model.agregarDisco.Disco;

public class Detalle_orden {
    private Integer cantidad;
    private Float costo;
    private Orden id_orden;
    private Disco id_disco;

    public Detalle_orden(Integer cantidad, Float costo, Orden id_orden, Disco id_disco) {
        this.cantidad = cantidad;
        this.costo = costo;
        this.id_orden = id_orden;
        this.id_disco = id_disco;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public Orden getId_orden() {
        return id_orden;
    }

    public void setId_orden(Orden id_orden) {
        this.id_orden = id_orden;
    }

    public Disco getId_disco() {
        return id_disco;
    }

    public void setId_disco(Disco id_disco) {
        this.id_disco = id_disco;
    }
}
