package org.Vazquez.Rojas.Diego.Alejandro.pixup.model;

public class Tipo_domicilio {
    private Integer Id;
    private String descripcion;

    public Tipo_domicilio() {
    }

    public Tipo_domicilio(Integer id, String descripcion) {
        Id = id;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
