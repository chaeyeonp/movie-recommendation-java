package Movie.controller;

import java.util.ArrayList;
import java.util.Iterator;

import Movie.model.dto.Movie;
import Movie.service.MovieService;
import Movie.view.EndView;
import exception.NotExistException;
import model.MovieDB;

public class Moivecontroller {

	final private int CURRENTYEAR = 2020;
	private static Moivecontroller instance = new Moivecontroller();
	private MovieService service = MovieService.getInstance();
	private ArrayList<Movie> getMovieList = service.getMoviesList();

	private Moivecontroller() {
	}

	public static Moivecontroller getInstance() {
		return instance;
	}

	public void printMovieList() {
		EndView.movieListView(getMovieList);
	}

	public void getMovieList() {
		if (getMovieList.size() != 0) {

		} else {
			EndView.messageView("���� ��ȭ ������ �����ϴ�.");
		}
	}

	public void filterGenresMovie(String genres) {
		ArrayList<Movie> movieList = service.getMoviesList();

		if (genres != null) {
			service.movieGenresFilter(genres);
		} else {
			EndView.messageView("�Է��Ͻ� �帣�� �����ϴ�.");
		}
	}

	public void filterYearMovie(int year) {
		if (0 <= year && year <= CURRENTYEAR) {
			service.movieYearFilter(year);
		} else {
			EndView.messageView("�Է��Ͻ� ���̰� ���������Դϴ�.");
		}
	}

	public void filterAgeMovie(int age) {
		if (0 <= age && age <= 500) {
			service.movieAgeFilter(age);
		} else {
			EndView.messageView("�Է��Ͻ� ���̰� ���������Դϴ�.");
		}
	}

	public void filterTitleMovie(String title) {

		if (title != null) {
			ArrayList<Movie> titleList;
			try {
				titleList = service.getTitleList(title);
				EndView.movieListView(titleList);
			} catch (NotExistException e) {
				e.printStackTrace();
			}
		} else {
			EndView.messageView("�Է��Ͻ� �帣�� �����ϴ�.");
		}

	}



}
