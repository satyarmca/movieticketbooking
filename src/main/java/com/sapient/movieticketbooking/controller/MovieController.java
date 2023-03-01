package com.sapient.movieticketbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.movieticketbooking.model.Movie;
import com.sapient.movieticketbooking.repository.MovieRepository;
import com.sapient.movieticketbooking.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	private MovieService movieService;

	@RequestMapping(value = "/{movieId}/{zip}")
	public List<Movie> getMoviesByCityandMovie(@PathVariable String movieId, @PathVariable String zip) {
		return null;

	}

	@PostMapping(value = "/createMovie")
	public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
		Movie movieCreated = movieService.createMovie(movie);
		return new ResponseEntity<>(movieCreated, HttpStatus.CREATED);
	}
}
