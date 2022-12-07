package com.gadv.proyectoforo.classes;

public class Respuesta {
    private String respuesta;
    private float calificacion;
    private String nombreUsuario;

    public Respuesta(  String nombreUsuario,String respuesta, float calificacion) {
        this.respuesta = respuesta;
        this.calificacion = calificacion;
        this.nombreUsuario = nombreUsuario;
    }

    public Respuesta() {
        this.respuesta = "";
        this.calificacion = 0;
        this.nombreUsuario = "";
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}
