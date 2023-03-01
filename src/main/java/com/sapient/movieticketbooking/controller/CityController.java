package com.sapient.movieticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.movieticketbooking.model.City;
import com.sapient.movieticketbooking.service.CitiesService;

@RestController
public class CityController {
	
	@Autowired
	private CitiesService citiesService;
	
	@PostMapping(value="/createCity")
	public City createCity(@RequestBody City city) {
		return citiesService.createCity(city);
	}

}
