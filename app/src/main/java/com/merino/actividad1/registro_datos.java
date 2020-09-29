package com.merino.actividad1;

public class registro_datos {

    String nombre;
    String apellido;
    String check;
    String valoracion;

    public registro_datos(String nombre, String apellido , String check, String valoracion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.check  = check;
        this.valoracion  = valoracion;


    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }


}
