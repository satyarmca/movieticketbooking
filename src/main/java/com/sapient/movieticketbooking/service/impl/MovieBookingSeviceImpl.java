package com.sapient.movieticketbooking.service.impl;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sapient.movieticketbooking.model.Movie;
import com.sapient.movieticketbooking.model.Theatre;

@Service
public class MovieBookingSeviceImpl {
	
	/**
	 * return the list of movie based on the movieId and the zip
	 * @param movieId
	 * @param zip
	 * @return
	 */
	public List<Theatre> getMovieTheatresByMovieNameAndCity(int movieId, Date date, String cityName){
		List<Theatre> theatres = Collections.emptyList();
		
		return null;
	}
}
