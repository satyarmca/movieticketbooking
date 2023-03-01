package com.sapient.movieticketbooking.service;

import java.util.List;

import com.sapient.movieticketbooking.model.Show;

public interface ShowsService {
	public List<Show> createShow(List<Show> shows);
	public List<Show> updateShows(List<Show> shows);
}
