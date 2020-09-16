package Movie.view;

import java.util.ArrayList;

import Movie.model.dto.Movie;

public class EndView {

	public static void messageView(String message) {
		System.out.println(message);
	}

	public static void movieListView(ArrayList<Movie> movieList) {
		for (Movie movie : movieList) {
			System.out.println(movie);
		}
	}

}
