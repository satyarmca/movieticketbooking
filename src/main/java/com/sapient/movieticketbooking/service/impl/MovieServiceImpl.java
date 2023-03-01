package com.sapient.movieticketbooking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.movieticketbooking.model.Movie;
import com.sapient.movieticketbooking.repository.MovieRepository;
import com.sapient.movieticketbooking.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;

	public Movie createMovie(Movie movie) {
		Movie movieCrearted=null;
		try {
			movieCrearted = movieRepository.save(movie);
		} catch (Exception e) {

		}

		return movieCrearted;
	}

}
