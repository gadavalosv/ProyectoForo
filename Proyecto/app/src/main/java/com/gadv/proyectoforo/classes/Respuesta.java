package com.gadv.proyectoforo.classes;

public class Respuesta {
    private String respuesta;
    private int calificacion;
    private String nombreUsuario;

    public Respuesta(String respuesta, int calificacion, String nombreUsuario) {
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

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}
