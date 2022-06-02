package com.gadv.proyectoforo.classes;

public class WallPost extends User{
    String userName;
    Boolean imageUser;
    String date;
    String content;

    public WallPost(){ new User(); }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void sendPost(){}
}
