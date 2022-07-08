import java.util.ArrayList;

public class HorrorMovieList {
    
    private ArrayList<String> movies;

    public void setMovies(ArrayList<String> movies){
        this.movies = movies;
    }

    public ArrayList<String> getMovies(){
        return this.movies;
    }

    public HorrorMovieList(){
        movies = new ArrayList<String>();
    }

}
