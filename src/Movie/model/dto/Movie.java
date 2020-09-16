package Movie.model.dto;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Movie {
	
	private String title;
	private int year;
	private int ageLimit;
	private float IMDb;
	private Boolean isNetflix;
	private String directors;
	private String genres;
	private String country;
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("영화제목 : ");
		builder.append(title);
		builder.append(", 개봉 연도 : ");
		builder.append(year);
		builder.append(", 연령 제한 : ");
		builder.append(ageLimit);
		builder.append(", 평점 : ");
		builder.append(IMDb);
		builder.append(", 감독 : ");
		builder.append(directors);
		builder.append(", 장르 : ");
		builder.append(genres);
		builder.append(", 국가 : ");
		builder.append(country);
		return builder.toString();
	}
}
