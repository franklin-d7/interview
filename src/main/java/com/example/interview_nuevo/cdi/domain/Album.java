package com.example.interview_nuevo.cdi.domain;

import java.util.Date;

public class Album {
    private int id;
    private String singer_id;
    private String title;
    private Date realease_date;

    public Album(int id, String singer_id, String title, Date realease_date) {
        this.id = id;
        this.singer_id = singer_id;
        this.title = title;
        this.realease_date = realease_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSinger_id() {
        return singer_id;
    }

    public void setSinger_id(String singer_id) {
        this.singer_id = singer_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getRealease_date() {
        return realease_date;
    }

    public void setRealease_date(Date realease_date) {
        this.realease_date = realease_date;
    }
}
