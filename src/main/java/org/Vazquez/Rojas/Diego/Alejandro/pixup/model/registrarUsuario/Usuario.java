package org.Vazquez.Rojas.Diego.Alejandro.pixup.model.registrarUsuario;

public class Usuario {
    private Integer Id;
    private String nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String password;
    private String rfc;
    private String curp;

    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String primer_apellido, String segundo_apellido, String password, String rfc, String curp) {
        Id = id;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.password = password;
        this.rfc = rfc;
        this.curp = curp;
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

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }
}
