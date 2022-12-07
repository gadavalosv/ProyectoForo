package com.gadv.proyectoforo.classes;

public class Baneados {
    private String correo;
    private String fechaInicio;
    private String fechaFin;

    public Baneados(String correo, String fechaInicio, String fechaFin) {
        this.correo = correo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Baneados() {
        this.correo ="";
        this.fechaInicio="";
        this.fechaFin="";
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
}
