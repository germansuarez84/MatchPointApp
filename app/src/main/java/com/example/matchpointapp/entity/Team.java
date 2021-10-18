package com.example.matchpointapp.entity;

import java.io.Serializable;

public class Team implements Serializable {
    private String name;
    private int points;

    public Team(String name) {
        this.name = name;
        this.points=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void addPoints(int points){
        this.points = this.points + points;
    }

    public String getScore(){
        return this.name + ": " + String.valueOf(this.points);
    }
}
