package com.sapient.movieticketbooking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.movieticketbooking.model.City;
import com.sapient.movieticketbooking.repository.CitiesRepository;
import com.sapient.movieticketbooking.service.CitiesService;

@Service
public class CitiesServiceImpl implements CitiesService{
	
	@Autowired
	CitiesRepository citiesRepository;
	
	public City createCity(City city) {
		return citiesRepository.save(city);
	}

}
