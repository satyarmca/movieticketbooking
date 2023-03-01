package com.sapient.movieticketbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.movieticketbooking.model.Screen;
import com.sapient.movieticketbooking.repository.ScreensRespository;

@RestController
public class ScreensController {
	
	@Autowired
	private ScreensRespository screensRespository;
	
	@PostMapping(value="/createScreens")
	private List<Screen> createScreens(@RequestBody List<Screen> screens){
		return screensRespository.saveAll(screens);
	}

}
