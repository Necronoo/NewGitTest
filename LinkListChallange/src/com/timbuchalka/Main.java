package com.timbuchalka;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Pokemaon", "GO");
        album.AddSong("Charizard", 20.20);
        album.AddSong("Pikachu", 11.11);
        album.AddSong("Miałczu", 11.14);
        album.AddSong("Picziczi", 22.1);
        album.AddSong("Oniks", 66.66);
        album.AddSong("Charmander", 20.20);
        album.AddSong("Bulbazaur", 20.20);
        albums.add(album);
        album = new Album("super", "truper");
        album.AddSong("super2", 22.22);
        album.AddSong("super3", 32.22);
        album.AddSong("super4", 42.22);
        album.AddSong("super5", 52.22);
        album.AddSong("super6", 62.22);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).Addtoplaylist("Charizard", playlist);
        albums.get(0).Addtoplaylist("Pikachu", playlist);
        albums.get(0).Addtoplaylist("Oniks", playlist);
        albums.get(0).Addtoplaylist("Oniksss", playlist);
        albums.get(0).Addtoplaylist("Bulbazaur", playlist);
        albums.get(0).Addtoplaylist("Charmander", playlist);
        albums.get(1).Addtoplaylist("super2", playlist);
        albums.get(1).Addtoplaylist("super3", playlist);
        albums.get(1).Addtoplaylist("super4", playlist);
        albums.get(1).Addtoplaylist("super5", playlist);
        albums.get(1).Addtoplaylist("1", playlist);
        play(playlist);
    }

    private static void play(LinkedList<Song> playlist) {
        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("ther is no song in this playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());


        }

//        ArrayList<Playlist> playlist = new LinkedList<>();
//        boolean quit = false;
//        Scanner scanner = new Scanner(System.in);
//        menu();
//        int Number;
//        Number = scanner.nextInt();
//        scanner.nextLine();
//        ListIterator<Playlist> listIterator = playlist.listIterator();
//        boolean forward = true;
//        if(playlist.isEmpty()){
//            System.out.println("add some music to playlist");
//        }
//        else {
//
//            while (!quit) {
//            switch (Number) {
//                case 1:
//                    System.out.println("Bye bye ");
//                    quit=true;
//                    break;
//                case 2:
//                    if{forward){
//                }
//                    if{
//                        (listIterator.hasNext());
//                    }{
//                }
//
//                case 3:
//
//
//                case 4:
//
//
//                case 5:
//
//
//                case 6:
//
//
//            }
//        }
//    }
//        }
//    }
//    private static void menu(){
//
//        System.out.println("\tpass\n"
//        +"1 for Quit\n"
//        +"2 for Skippforward a song\n"
//        +"3 for Skippbackwards to previus song\n"
//        +"4 for replay\n"
//        +"5 for print list of Song of playlist\n"
//        +"6 to remove the song from list");
//
//        }

    }
}