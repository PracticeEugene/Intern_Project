package home_task_2_Stream;

public class Movie {
    private String name;
    private int year;
    private double imdbRating;

    public Movie(String name, int year, double imdbRating) {
        this.name = name;
        this.year = year;
        this.imdbRating = imdbRating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public String toString() {
        return String.format("%s (%d) - IMDb Rating: %.1f", name, year, imdbRating);
    }
}

