package org.Vazquez.Rojas.Diego.Alejandro.pixup.model;

public class Colonia {
    private Integer Id;
    private String nombre;
    private String cp;
    private Municipio municipio;

    public Colonia() {
    }

    public Colonia(Integer id, String nombre, String cp, Municipio municipio) {
        Id = id;
        this.nombre = nombre;
        this.cp = cp;
        this.municipio = municipio;
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

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
}
