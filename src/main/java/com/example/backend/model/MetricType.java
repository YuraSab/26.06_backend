package com.example.backend.model;

import java.util.List;

public class MetricType {


    private int id;
    private List<Integer> data;
    private String author;
    private String caption;
    private String about;
    private String date;

    public MetricType() {}

    public MetricType(int id, List<Integer> data, String author, String caption, String about, String date) {
        this.id = id;
        this.data = data;
        this.author = author;
        this.caption = caption;
        this.about = about;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

