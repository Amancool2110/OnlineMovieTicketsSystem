package com.capgemini.onlinemoviebooking.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="movie_movie")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="movie_id")
	private Integer movieId;
	
	@NotEmpty(message="Movie Name should be Mandatory")
	@Column(name="movie_name", length=30,nullable=false)
	private String movieName;
	
	private String genre;
	private String language;
	
	@NotEmpty(message="Movie director name should be Mandatory")
	@Column(name="director", length=25,nullable=false)
	private String director;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(Integer movieId, @NotEmpty(message = "Movie Name should be Mandatory") String movieName, String genre,
			String language, @NotEmpty(message = "Movie director name should be Mandatory") String director) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.genre = genre;
		this.language = language;
		this.director = director;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", genre=" + genre + ", language=" + language
				+ ", director=" + director + "]";
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	
	
	
}

