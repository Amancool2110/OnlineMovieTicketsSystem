package com.capgemini.onlinemoviebooking.service;
import java.util.List;
import com.capgemini.onlinemoviebooking.entity.Movie;

public interface MovieService {
	public Movie addMovie(Movie movie);
	public Boolean deleteMovie(Integer movieId);
	public List<Movie> showAllMovie();
	public Movie showMovie(int id);
	
	

}
