package com.timbuchalka;

import java.util.ArrayList;

public class Playlist {
    private String name;
    private ArrayList<Album> albums;



    public Playlist (String name){
        this.name= name;
        this.albums = new ArrayList<>();
    }
    public boolean AddAlbum(String name){
        if(Exist(name)==null){
            albums.add(new Album(name));
            return true;
        }
        System.out.println("The album is already created");
        return false;

    }
        private Album Exist(String name){
            for(int i =0; i<albums.size();i++){
                Album corentalbum = this.albums.get(i);
                if (corentalbum.getName().equals(name)) {
                    return corentalbum;
                }
            }
            return null;
    }

    public boolean AddSong(String Albumname, String Songname, double Duration){
        if (Exist(Albumname)!=null){
            Album album = Exist(Albumname);
            album.AddSong(Songname,Duration);
            return true;
        }
        return false;
    }
    public void PrintAllbumAndSong(){
        for(int i =0 ; i<albums.size();i++){
            Album correntalbum = albums.get(i);
            System.out.println("Albums name: " +correntalbum.getName());
            System.out.println("with Songs : ");
            ArrayList<Song> songs = correntalbum.getSongs();
            for(int j =0; j<songs.size();j++){
                Song Thissong = songs.get(j);
                System.out.println(Thissong.getTitle()+ "  have lenght " + Thissong.getDuration());
            }
        }
    }
    public String getName(){
        return this.name;
    }
public ArrayList<Album> getAlbums(){
        return albums;
}
}
