package com.timbuchalka;

public class Song {
    private String title; //Title; małej kutasie !
    private double duration ;//String duration;

    public Song (String title, double duration){
        this.title= title;
        this.duration = duration;
    }
    public String getTitle(){
        return this.title;
    }
    public double getDuration(){
        return this.duration;
    }

    @Override
    public String toString() {
        return this.title + ": "+ this.duration;
    }
}


