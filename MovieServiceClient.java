import com.newgen.imdb.model.Movie;
import com.newgen.imdb.service.MovieService;

import java.util.List;

public class MovieServiceClient {
    public static void main(String[] args) {

        MovieService movieService = new MovieService();
        movieService.addMovie("Chhaava","History",2025);
        movieService.addMovie("Pushpa","Action",2024);
        movieService.addMovie("Baby John","Action",2024);
        movieService.addMovie("Marco", "Action",2024);
        movieService.addMovie("Max","Action",2024);


        Movie movie=movieService.getMovieById(2);
        System.out.println(movie);

        List<Movie> movies =movieService.getAllMovies();
        System.out.println(movies);




    }
}
