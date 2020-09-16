//module-info.java;
package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import Movie.model.dto.Movie;

public class MovieDB {
	private static MovieDB instance = new MovieDB("movie.csv");
	private ArrayList<Movie> movieList = new ArrayList<Movie>();
	
	private MovieDB(String fileName) {

		
		Path pathToFile = Paths.get(fileName);

		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {

			String line = br.readLine();

			while (line != null) {
				String[] attributes = line.split(",",9);

				Movie movie = createList(attributes);

				movieList.add(movie);
				
				line = br.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private Movie createList(String[] metadata) {

			String title = metadata[0];
			int year = Integer.parseInt(metadata[1]); 
			int ageLimit = Integer.parseInt(metadata[2]);
			float IMDb = Float.parseFloat(metadata[3]);
			Boolean isNetflix = Boolean.parseBoolean(metadata[4]);
			String directors = metadata[5];
			String genre = metadata[6];
			String country = metadata[7];

			return new Movie(title,year,ageLimit,IMDb,isNetflix,directors,genre,country);
	}
	
	public static MovieDB getInstance() {
		return instance;
	}

	public ArrayList<Movie> getMovieList() {
		return movieList;
	}
	
	

	public void insertProject(Movie newMovie) {
		movieList.add(newMovie);
	}

}