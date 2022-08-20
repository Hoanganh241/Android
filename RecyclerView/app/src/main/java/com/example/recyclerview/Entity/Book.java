package com.example.recyclerview.Entity;

public class Book {
    private int resourceId;
    private String title;

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = title;
    }

    public Book(int resourceId, String title) {
        this.resourceId = resourceId;
        this.title = title;
    }
}
