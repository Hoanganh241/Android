package com.example.multitype.Unity;

public class User {

    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFeatured() {
        return isFeatured;
    }

    public void setFeatured(boolean featured) {
        isFeatured = featured;
    }

    public User(int sourceId, String name, boolean isFeatured) {
        this.sourceId = sourceId;
        this.name = name;
        this.isFeatured = isFeatured;
    }

    private int sourceId;
    private String name;
    private boolean isFeatured;


}
