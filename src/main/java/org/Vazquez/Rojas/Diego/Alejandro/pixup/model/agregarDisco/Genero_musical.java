package org.Vazquez.Rojas.Diego.Alejandro.pixup.model.agregarDisco;

public class Genero_musical {
    private Integer Id;
    private String descripcion;

    public Genero_musical() {
    }

    public Genero_musical(Integer id, String descripcion) {
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
