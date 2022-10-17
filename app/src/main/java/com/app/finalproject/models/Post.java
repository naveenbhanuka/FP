package com.app.finalproject.models;

import java.io.Serializable;

public class Post implements Serializable {
    private int id;
    private String title;
    private String description;
    private String name;


    public Post(int id, String title, String description, String name) {
        this.id = id;
        this.description = description;
        this.title = title;
        this.name = name;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
