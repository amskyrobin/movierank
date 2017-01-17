package example.codeclan.com.movierank;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 17/01/2017.
 */

public class RankList {
    private ArrayList<Movie> rankList;

    public RankList() {

        rankList = new ArrayList<Movie>();

        }

        public RankList(ArrayList < Movie > rankList) {
            rankList = new ArrayList<Movie>(rankList);
        }

        public ArrayList<Movie> getRank () {
            return new ArrayList<Movie>(rankList);
        }

    public void addMovie(Movie movie) {
        rankList.add(movie);
    }

    public int countRankList() {
        return rankList.size();
    }

   public Movie getMovieAtIndex(int index){
       return rankList.get(index);
   }
}

