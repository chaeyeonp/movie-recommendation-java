package Movie.view;

import java.util.Scanner;

import Movie.controller.Moivecontroller;
import Movie.model.dto.Movie;

public class StartView {
	public static void main(String[] args) {
		Moivecontroller controller = Moivecontroller.getInstance();
		Scanner scan = new Scanner(System.in);

		System.out.println("=======메뉴를 선택하세요.=======");
		System.out.println("|| a. 영화 추천 || b. 영화 검색 ||");
		System.out.println("==========================");
		System.out.println("여기에 입력하세요: ");
		
		char menu = scan.next().charAt(0);

		if (menu == 'a') {
			System.out.println("-----영화 추천 프로그램 ------");
			controller.getMovieList();

			System.out.println("1.원하시는 장르를 입력하세요 : ");
			controller.filterGenresMovie(scan.next());
			

			System.out.println("2.원하시는 연도를 입력하세요 : ");
			controller.filterYearMovie(scan.nextInt());

			System.out.println("3.원하시는 나이를 입력하세요 : ");
			controller.filterAgeMovie(scan.nextInt());

			System.out.println("4.평점 순에 따른 추천영화 5개입니다.");
			// controller.top5Movie();

		} else if(menu == 'b')
		{
			
			System.out.println("===========메뉴를 선택하세요.===========");
			System.out.println("||a. 모든 영화 목록 검색 || b. 영화 제목 검색||");
			System.out.println("==================================");
			System.out.println("여기에 입력하세요: ");
			
			char menu1 = scan.next().charAt(0);
			
			if(menu1 == 'a') {
				System.out.println("모든  영화 목록 검색");
				controller.printMovieList();
			}
			
			if(menu1 == 'b') {
				System.out.println("검색할 영화 이름을 입력하시오 : ");
				controller.filterTitleMovie(scan.next());
			}
			
		}
		else 
		{
			System.out.println("실행할 수 없는 메뉴입니다.");
		}
		
		System.out.println("검색할 영화 이름을 입력하시오 : ");
		controller.filterTitleMovie(scan.next());
//		controller.getTop5Movie();
	}

}
