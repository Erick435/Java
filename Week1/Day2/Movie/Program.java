import java.util.ArrayList;

public class Program {

    public MovieList movieList;

    public HorrorMovieList horrorMovieList;

    public Program(){
        movieList = new MovieList();
        horrorMovieList = new HorrorMovieList();
    }
    public static void main(String[] args){

        Program program = new Program();

        program.movieList.movies.add("Friday");
        program.movieList.movies.add("Avatar");
        program.movieList.movies.add("Dodgeball");
        program.movieList.movies.add("Marvel");
        program.movieList.movies.add("Step Brothers");

        ArrayList<String> horrorMovies = program.horrorMovieList.getMovies();
        horrorMovies.add("The Ring");
        horrorMovies.add("Amityville");
        horrorMovies.add("Saw");
        horrorMovies.add("The Grudge");
        horrorMovies.add("The Haunting In Connecticut");
        horrorMovies.add("Exorcist");
        horrorMovies.add("Jeepers Creepers");

        ArrayList<String> horrorMovies2 = program.horrorMovieList.getMovies();
        for(String movie: horrorMovies2){
            System.out.println(movie);
        }

        // program.HorrorMovieList.movies.add("The Ring");
        // program.HorrorMovieList.movies.add("Saw");
        // program.HorrorMovieList.movies.add("The Grudge");
        // program.HorrorMovieList.movies.add("The Haunting In Connecting");
        // program.HorrorMovieList.movies.add("Exorcist");
        // program.HorrorMovieList.movies.add("Jeepers Creepers");
        
    }
};
