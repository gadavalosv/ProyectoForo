package com.gadv.proyectoforo.classes;

public class User {
    int idUser;
    String userName;
    String mail;
    String password;
    boolean imageUser;

    public User(){}

    public User(String userName, String mail, String password){
        this.userName = userName;
        this.mail = mail;
        this.password = password;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public void closeAccount(){}

    public void openAccount(){}

    public void submit(){}
}
