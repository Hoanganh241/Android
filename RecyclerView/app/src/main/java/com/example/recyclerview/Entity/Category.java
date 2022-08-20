package com.example.recyclerview.Entity;

import java.util.List;

public class Category {
    private String nameCategory;
    private List<Book> books;

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Category(String s, List<Book> books) {
        this.books = books;
    }
}
