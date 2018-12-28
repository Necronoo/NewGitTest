package com.timbuchalka;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist= artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean AddSong(String Songname, double duration) {
        if (Exist(Songname)==null) {
            songs.add(new Song(Songname, duration));
            return true;
        } else {
            System.out.println("song " + Songname + " exist in album");
            return false;
        }

    }

    private Song Exist(String songsname) {
        for (Song correntsong : this.songs){
            if (correntsong.getTitle().equals(songsname)) {
                return correntsong;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
    public boolean Addtoplaylist(int trucknumber, LinkedList<Song> songs){
        int index = trucknumber-1;
        if(index>=0 && index <=songs.size()){
            songs.add(this.songs.get(index));
            return true;
        }
        System.out.println("This albbu dont have "+ trucknumber + " tranck, ther is only" + (this.songs.size()+1)+ " songs");
        return false;
    }
    public boolean Addtoplaylist(String songsname, LinkedList<Song> songs){
        Song song = Exist(songsname);
        if(song!=null){
            songs.add(song);
            return true;
        }
        System.out.println("ther is no "+ songsname +" in this album");
        return false;
    }
}



