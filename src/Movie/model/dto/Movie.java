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
		builder.append("��ȭ���� : ");
		builder.append(title);
		builder.append(", ���� ���� : ");
		builder.append(year);
		builder.append(", ���� ���� : ");
		builder.append(ageLimit);
		builder.append(", ���� : ");
		builder.append(IMDb);
		builder.append(", ���� : ");
		builder.append(directors);
		builder.append(", �帣 : ");
		builder.append(genres);
		builder.append(", ���� : ");
		builder.append(country);
		return builder.toString();
	}
}
