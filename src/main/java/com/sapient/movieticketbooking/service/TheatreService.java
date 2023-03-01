package com.sapient.movieticketbooking.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.sapient.movieticketbooking.model.Theatre;

public interface TheatreService {

	public Theatre createTheatre(Theatre theatre);
	
	public List<Map<String, Object>> getMovieTheatresByMovieNameAndCity(int movieId, String movieName, Date showDate,
			String cityName);

}
