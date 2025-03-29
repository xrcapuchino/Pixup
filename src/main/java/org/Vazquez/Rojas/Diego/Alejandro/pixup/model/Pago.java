package org.Vazquez.Rojas.Diego.Alejandro.pixup.model;

import java.sql.Timestamp;

public class Pago {
    private Integer Id;
    private Integer num_tarjeta;
    private Float monto;
    private Timestamp fecha;
    private Orden id_orden;

    public Pago() {
    }

    public Pago(Integer id, Integer num_tarjeta, Float monto, Timestamp fecha, Orden id_orden) {
        Id = id;
        this.num_tarjeta = num_tarjeta;
        this.monto = monto;
        this.fecha = fecha;
        this.id_orden = id_orden;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getNum_tarjeta() {
        return num_tarjeta;
    }

    public void setNum_tarjeta(Integer num_tarjeta) {
        this.num_tarjeta = num_tarjeta;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public Orden getId_orden() {
        return id_orden;
    }

    public void setId_orden(Orden id_orden) {
        this.id_orden = id_orden;
    }
}
