package com.sapient.movieticketbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.movieticketbooking.model.Show;
import com.sapient.movieticketbooking.service.ShowsService;

@RestController
public class ShowsController {
	
	@Autowired
	private ShowsService showsService;
	
	@PostMapping(value="/createShows")
	public List<Show> createShows(@RequestBody List<Show> shows){
		return showsService.createShow(shows);
	}
	
	@PostMapping(value="/updateShows")
	public List<Show> findShows(@RequestBody List<Show> shows){
		return showsService.updateShows(shows);
	}

}
