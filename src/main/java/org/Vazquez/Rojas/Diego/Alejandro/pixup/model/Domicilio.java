package org.Vazquez.Rojas.Diego.Alejandro.pixup.model;

public class Domicilio {
    private Integer Id;
    private String calle;
    private Integer num_exterior;
    private Integer num_interior;
    private Usuario id_usuario;
    private Colonia id_colonia;
    private Tipo_domicilio id_tipo_domicilio;

    public Domicilio() {
    }

    public Domicilio(Integer id, String calle, Integer num_exterior, Integer num_interior, Usuario id_usuario, Colonia id_colonia, Tipo_domicilio id_tipo_domicilio) {
        Id = id;
        this.calle = calle;
        this.num_exterior = num_exterior;
        this.num_interior = num_interior;
        this.id_usuario = id_usuario;
        this.id_colonia = id_colonia;
        this.id_tipo_domicilio = id_tipo_domicilio;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNum_exterior() {
        return num_exterior;
    }

    public void setNum_exterior(Integer num_exterior) {
        this.num_exterior = num_exterior;
    }

    public Integer getNum_interior() {
        return num_interior;
    }

    public void setNum_interior(Integer num_interior) {
        this.num_interior = num_interior;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Colonia getId_colonia() {
        return id_colonia;
    }

    public void setId_colonia(Colonia id_colonia) {
        this.id_colonia = id_colonia;
    }

    public Tipo_domicilio getId_tipo_domicilio() {
        return id_tipo_domicilio;
    }

    public void setId_tipo_domicilio(Tipo_domicilio id_tipo_domicilio) {
        this.id_tipo_domicilio = id_tipo_domicilio;
    }
}
