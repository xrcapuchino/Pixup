package org.Vazquez.Rojas.Diego.Alejandro.pixup.model.registrarUsuario;

public class Notificacion {
    private Integer Id;
    private String fecha_notificacion;
    private Usuario id_usuario;
    private Tipo_domicilio id_tipo_notificacion;

    public Notificacion() {
    }

    public Notificacion(Integer id, String fecha_notificacion, Usuario id_usuario, Tipo_domicilio id_tipo_notificacion) {
        Id = id;
        this.fecha_notificacion = fecha_notificacion;
        this.id_usuario = id_usuario;
        this.id_tipo_notificacion = id_tipo_notificacion;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getFecha_notificacion() {
        return fecha_notificacion;
    }

    public void setFecha_notificacion(String fecha_notificacion) {
        this.fecha_notificacion = fecha_notificacion;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Tipo_domicilio getId_tipo_notificacion() {
        return id_tipo_notificacion;
    }

    public void setId_tipo_notificacion(Tipo_domicilio id_tipo_notificacion) {
        this.id_tipo_notificacion = id_tipo_notificacion;
    }
}
