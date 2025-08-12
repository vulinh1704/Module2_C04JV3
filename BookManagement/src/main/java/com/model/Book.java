package com.model;

public class Book {
    private String name;
    private Long id;
    private String author;
    private Long categoryId;
    private static Long countId = 1000L;

    public Book(String author, String name, Long categoryId) {
        this.id = countId;
        this.author = author;
        this.name = name;
        this.categoryId = categoryId;
        countId++;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
