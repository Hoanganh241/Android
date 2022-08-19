package com.example.recyclerview;

public class User {
    private int resoureImage;
    private String name;

    public int getResoureImage() {
        return resoureImage;
    }

    public void setResoureImage(int resoureImage) {
        this.resoureImage = resoureImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(int resoureImage, String name) {
        this.resoureImage = resoureImage;
        this.name = name;
    }
}
