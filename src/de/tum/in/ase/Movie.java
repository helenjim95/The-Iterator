package de.tum.in.ase;

public class Movie implements Comparable<Movie> {

    private final String name;
    private double budget;
    private MovieGenre movieGenre;

    public Movie(String name, double budget, MovieGenre movieGenre) {
        this.name = name;
        this.budget = budget;
        this.movieGenre = movieGenre;
    }

    public String getName() {
        return name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public MovieGenre getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(MovieGenre movieGenre) {
        this.movieGenre = movieGenre;
    }

    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Movie movie)) {
            return false;
        }
        return this.getName().equals(movie.getName());
    }

    @Override
    public String toString() {
        return "The name of this movie is " + this.getName() + " and the money spent on this movie is " + this.getBudget() + ".";
    }

    @Override
    public int compareTo(Movie other) {
        return Double.compare(this.getBudget(), other.getBudget());
    }
}
