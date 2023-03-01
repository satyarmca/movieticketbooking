package com.sapient.movieticketbooking.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.movieticketbooking.model.Theatre;
import com.sapient.movieticketbooking.service.TheatreService;

@RestController
public class TheaterController {

	@Autowired
	private TheatreService theatreService;

	@PostMapping(value = "/createTheatre")
	public Theatre createTheater(@RequestBody Theatre theatre) {

		return theatreService.createTheatre(theatre);
	}

	@GetMapping(value = "/getTheatres/{movieId}/{movieName}/{showDate}/{cityName}")
	public List<Map<String, Object>> getMovieTheatresByMovieNameAndCity(@PathVariable String movieId, 
			@PathVariable String movieName,
			@PathVariable String showDate, @PathVariable String cityName) {
		Date date = null;
		try {
			date = new SimpleDateFormat("yy-MM-dd").parse(showDate);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return theatreService.getMovieTheatresByMovieNameAndCity(Integer.parseInt(movieId), movieName, date, cityName);
	}

}
