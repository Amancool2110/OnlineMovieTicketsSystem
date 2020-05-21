package com.capgemini.onlinemoviebooking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.capgemini.onlinemoviebooking.dao.MovieDao;
import com.capgemini.onlinemoviebooking.entity.Movie;

@Service
@Transactional
public class MovieServiceImp implements MovieService{

	@Autowired
	MovieDao movieDao;
	
	@Override
	public Movie addMovie(Movie movie) {
		return movieDao.save(movie);
		
	}

	@Override
	public Boolean deleteMovie(Integer movieId) {
		movieDao.deleteById(movieId);
		
		return true;
	}

	@Override
	public List<Movie> showAllMovie() {
		return movieDao.findAll();
		
	}
	@Override
	public Movie showMovie(int id) {
		Optional<Movie> movie=movieDao.findById(id);
		if(movie.isPresent())
			return movie.get();
		
		else 
			return null;
	}

	
}