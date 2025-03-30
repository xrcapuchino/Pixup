package org.Vazquez.Rojas.Diego.Alejandro.pixup.model.agregarDisco;

public class Disquera {
    private Integer Id;
    private String nombre;

    public Disquera() {
    }

    public Disquera(Integer id, String nombre) {
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
