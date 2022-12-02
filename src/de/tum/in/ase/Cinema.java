package de.tum.in.ase;

import java.util.Iterator;

public class Cinema {
    //TODO: Implement for the Cinema class the Iterable (for Movie) interface
    // You can check Movie class to see the syntax for implementing such an interface

    private final String address;
    private final Movie[] movies;

    public Cinema(String address, Movie[] movies) {
        this.address = address;
        this.movies = movies;
    }
    
    public String getAddress() {
        return address;
    }
    
    public Movie[] getMovies() {
        return movies;
    }


    //TODO: Put @Override annotation on top of this iterator after completing the first TODO in this class
    //TODO: Return a new Iterator and override and implement the hasNext() and next() methods in it

    public Iterator<Movie> iterator() {
        return null;
    }

    //TODO: After implementing everything, test your iterator in the main method

    public static void main(String[] args) {}
}
