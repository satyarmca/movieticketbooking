package com.sapient.movieticketbooking.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.movieticketbooking.model.Screen;
import com.sapient.movieticketbooking.repository.ScreensRespository;
import com.sapient.movieticketbooking.service.ScreensService;

@Service
public class ScreensServiceImpl implements ScreensService{

	
	@Autowired
	ScreensRespository screensRespository;
	
	public List<Screen> getAllScreens(){
		return screensRespository.findAll();
	}
	
	public Screen saveScreen(Screen screen) {
		return screensRespository.save(screen);
	}
}
