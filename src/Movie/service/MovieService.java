package Movie.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import Movie.model.dto.Movie;
import exception.NotExistException;
import model.MovieDB;

public class MovieService {

	private static MovieService instance = new MovieService();
	ArrayList<Movie> getMovieList = MovieDB.getInstance().getMovieList();

	private MovieService() {
	}

	public static MovieService getInstance() {
		return instance;
	}

	public ArrayList<Movie> getMoviesList() {
		return getMovieList;
	}

	public void movieGenresFilter(String genres) {

		ArrayList<Movie> genrelist = new ArrayList<Movie>();
		
		

		for (int i = 0; i < getMovieList.size(); i++) {
			if (getMovieList.get(i).getGenres().contains(genres)) {
				genrelist.add(getMovieList.get(i));
			}

		}

		genrelist.forEach(System.out::println);

//		for (Movie movie : getMovieList) {
//			System.out.println(movie.toString());
//		}

//		getMovieList.removeIf(!getMovieList.get(i).getGenres().equals(genres))

		// 받은 장르와 원하는 장르가 동일한지 확인

		// list 출력

		/*
		 * private static int sumStream(List<Integer> list){return
		 * list.stream().filter(i -> i >10).maptoInt(i->i).sum()}
		 * 
		 */

//		for (Iterator<Movie> iter = getMovieList.iterator(); iter.hasNext();) {
//			Movie temp = iter.next();
//			if (!temp.getGenres().equals(genres)) {
//				iter.remove();
//			}
//		}
//		for (Movie movie : getMovieList) {
//			System.out.println(movie.toString());
//		}
	}

	public void movieYearFilter(int year) {

//		for (Iterator<Movie> iter = getMovieList.iterator(); iter.hasNext();) {
//			Movie temp = iter.next();
//			
//			if (!(year - 10 < temp.getYear() && temp.getYear() < year + 10)) {
//				iter.remove();
//			}
//		}
//		
//		for (Movie movie : getMovieList) {
//			System.out.println(movie.toString());
//		}

		/*
		 * private static int sumStream(List<Integer> list){return
		 * list.stream().filter(i -> i >10).maptoInt(i->i).sum()}
		 * 
		 */
	}

	public void movieAgeFilter(int age) {
		for (Iterator<Movie> iter = getMovieList.iterator(); iter.hasNext();) {
			Movie temp = iter.next();

			if (temp.getAgeLimit() > age) {
				iter.remove();
			}
		}
		for (Movie movie : getMovieList) {
			System.out.println(movie.toString());
		}
	}

	public ArrayList<Movie> getTitleList(String title) throws NotExistException {
		ArrayList<Movie> titleList = new ArrayList<Movie>();

		for (Iterator<Movie> iter = getMovieList.iterator(); iter.hasNext();) {
			Movie temp = iter.next();

			if (temp.getTitle().contains(title)) {
				titleList.add(temp);
			}
		}

		return titleList;
	}

}
