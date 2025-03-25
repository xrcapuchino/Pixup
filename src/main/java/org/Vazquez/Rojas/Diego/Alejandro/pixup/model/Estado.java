package org.Vazquez.Rojas.Diego.Alejandro.pixup.model;

public class Estado {
    private Integer Id;
    private String nombre;

    public Estado() {
    }

    public Estado(Integer id, String nombre) {
        Id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
