package com.sapient.movieticketbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.movieticketbooking.model.Screen;

@Repository
public interface ScreensRespository extends JpaRepository<Screen, Integer>{
	
	public List<Screen> getScreenByTheatreId(int theatreId);
	

}
