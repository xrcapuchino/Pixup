package org.Vazquez.Rojas.Diego.Alejandro.pixup.model.registrarUsuario;

public class Municipio {
    private Integer Id;
    private String nombre;
    private Estado estado;

    public Municipio() {
    }

    public Municipio(Integer id, String nombre, Estado estado) {
        Id = id;
        this.nombre = nombre;
        this.estado = estado;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
