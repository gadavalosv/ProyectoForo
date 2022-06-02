package com.gadv.proyectoforo.classes;

public class Manager {
    int idUser;
    String name;
    String lastName;
    String mail;
    String password;
    String position;

    public Manager(){}

    public Manager(String mail, String password){
        this.mail = mail;
        this.password = password;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
