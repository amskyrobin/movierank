package example.codeclan.com.movierank;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/01/2017.
 */

public class MovieTest {

    @Before
    public void setup() throws Exception {
    }


    @Test
    public void canGetTitle(){
        Movie movie = new Movie("Adaptation", "Comedy Drama", 1);
        assertEquals("Adaptation", movie.getTitle());
    }

    @Test
    public void canGetGenre(){
        Movie movie = new Movie("Adaptation", "Comedy Drama", 1);
        assertEquals("Comedy Drama", movie.getGenre());
    }

    @Test
    public void canGetRank(){
        Movie movie = new Movie("Adaptation", "Comedy Drama", 1);
        assertEquals(1, movie.getRank(), 0.1);
    }

//    @Test
//    public void canGetDetails(){
//        Movie movie = new Movie("Adaptation", "Comedy Drama", 1);
//
//    }

    @Test
    public void canAddMovieToRankList(){
        Movie movie = new Movie("Adaptation", "Comedy Drama", 1);
        RankList rankList = new RankList();
        rankList.addMovie(movie);
        assertEquals(1, rankList.countRankList());

    }

    @Test
    public void canGetMovieDetails(){
        Movie movie = new Movie("Adaptation", "Comedy Drama", 1);
        movie.printMovieDetails();
        assertEquals("Title: Adaptation Genre: Comedy Drama Rank: 1.0", movie.printMovieDetails());
    }
}
