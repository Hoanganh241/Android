package com.example.recyclerview_using_linearlayout_vertical;

public class User {
    private int resourceId;
    private String name;

    public User(int image1, String name) {
        this.name = name;
    }

    public User(int resourceId) {
        this.resourceId = resourceId;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
