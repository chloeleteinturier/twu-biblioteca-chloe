package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {

    public static ArrayList<Media> books;
    public static ArrayList<Media> movies;

    public Library(ArrayList<Media> books, ArrayList<Media> movies){
        this.books = books;
        this.movies = movies;
    }

    public static ArrayList<Media> getBooks(){
        return books;
    }

    public static ArrayList<Media> getMovies(){
        return movies;
    }

    public static void displayMedias(ArrayList<Media> mediasToDisplay){
        if(mediasToDisplay.size()>0) {
            for (Media media : mediasToDisplay) {
                System.out.println(mediasToDisplay.indexOf(media) + ": " + media.getInfo());
            }
        } else {
            System.out.println("No movies to show!");
        }
        System.out.println("");
    }

    public static ArrayList<Media> getAvailableMedias(ArrayList<Media> mediaToFilter){
        ArrayList<Media> mediasAvailable = new ArrayList<Media>();
        for (Media media : mediaToFilter){
            if(media.getIsAvailable()) {
                mediasAvailable.add(media);
            }
        }
        return mediasAvailable;
    }

    public static ArrayList<Media> getNotAvailableMedias(ArrayList<Media> mediaToFilter){
        ArrayList<Media> mediasNotAvailable = new ArrayList<Media>();

        for (Media media : mediaToFilter){
            if(!media.getIsAvailable()) {
                mediasNotAvailable.add(media);
            }
        }
        return mediasNotAvailable;
    }

}
