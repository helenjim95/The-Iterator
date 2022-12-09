package de.tum.in.ase;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Cinema<Movie> implements Iterable<Movie> {
    //Implement for the Cinema class the Iterable (for Movie) interface
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

    //Put @Override annotation on top of this iterator
    //Return a new Iterator and override and implement the hasNext() and next() methods in it

    @Override
    public Iterator<Movie> iterator() {
        return new Iterator<Movie>() {
            int index = 0;

            final Movie[] movies = getMovies();

    //    If in movies there are no indices that haven't been iterated, then hasNext should return false
            @Override
            public boolean hasNext() {
                return index < movies.length;
            }

//             If in movies there are no indices left to iterate, then next should throw a NoSuchElementException.
//             If there is indeed at least one more Movie element in the movies, return this next element.
            @Override
            public Movie next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return movies[index++];
            }
        };
    }

    //After implementing everything, test your iterator in the main method

    public static void main(String[] args) {}

}
