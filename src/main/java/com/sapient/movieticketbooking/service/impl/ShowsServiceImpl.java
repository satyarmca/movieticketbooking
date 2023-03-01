package com.sapient.movieticketbooking.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.movieticketbooking.model.Show;
import com.sapient.movieticketbooking.repository.ShowsRepository;
import com.sapient.movieticketbooking.service.ShowsService;

@Service
public class ShowsServiceImpl implements ShowsService {

	@Autowired
	private ShowsRepository showsRepository;

	public Show saveShow(Show show) {
		return showsRepository.save(show);
	}

	public List<Show> createShow(List<Show> shows) {
		return showsRepository.saveAll(shows);
	}

	public void deleteShow(List<Show> shows) {
		// showsRepository.deleteAllById(shows.stream().map(s->s.getShowId()).collect(Collectors.toList()));;
		showsRepository.deleteAll(shows);
	}

	public List<Show> updateShows(List<Show> shows) {

		/*
		 * List<Show> showsInDB = showsRepository .findByShowIdIn(shows.stream().map(s
		 * -> s.getShowId()).collect(Collectors.toList())); for(Show s: showsInDB) {
		 * 
		 * }
		 */
		return showsRepository.saveAll(shows);
		//return showsRepository.findByShowIdIn(shows.stream().map(s -> s.getShowId()).collect(Collectors.toList()));
	}
}
