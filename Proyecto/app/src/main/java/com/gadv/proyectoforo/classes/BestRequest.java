package com.gadv.proyectoforo.classes;

public class BestRequest extends User{
    String userName;
    String comment;
    int stars;

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void publishComment(){}
}
