package example.codeclan.com.movierank;

/**
 * Created by user on 17/01/2017.
 */

public class Movie {
    private String title;
    private String genre;
    private double rank;


    public Movie(String title, String genre, double rank) {
        this.title = title;
        this.genre = genre;
        this.rank = rank;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }


    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }


    public double getRank() {
        return this.rank;
    }

    public void setRank(int rank){
        this.rank = rank;
    }

    public String printMovieDetails(){
        return "Title: " + this.title + " Genre: " + this.genre + " Rank: " + this.rank;
    }
}
