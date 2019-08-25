package com.example.myapplication;
import java.io.Serializable;

public class Chat  implements Serializable {
    String message, time,name, imgURL;
    int numberLikes;

    public  Chat(){

    }

    public Chat(String message, String time, String name, String imgURL, int numberLikes) {
        this.message = message;
        this.time = time;
        this.name = name;
        this.imgURL = imgURL;
        this.numberLikes = numberLikes;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public int getNumberLikes() {
        return numberLikes;
    }

    public void setNumberLikes(int numberLikes) {
        this.numberLikes = numberLikes;
    }
}
