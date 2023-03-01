package com.sapient.movieticketbooking.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.movieticketbooking.model.Screen;
import com.sapient.movieticketbooking.model.Show;
import com.sapient.movieticketbooking.model.Theatre;
import com.sapient.movieticketbooking.repository.CitiesRepository;
import com.sapient.movieticketbooking.repository.ScreensRespository;
import com.sapient.movieticketbooking.repository.ShowsRepository;
import com.sapient.movieticketbooking.repository.TheaterRepository;
import com.sapient.movieticketbooking.service.TheatreService;

@Service
public class TheatreServiceImpl implements TheatreService {

	@Autowired
	private TheaterRepository theaterRepository;

	@Autowired
	private ScreensRespository screensRespository;

	@Autowired
	private ShowsRepository showsRepository;

	@Autowired
	private CitiesRepository citiesRepository;

	/**
	 * return the list of Theatres and shows based on the movieId and the cityName
	 * 
	 * @param movieId
	 * @return
	 */
	public List<Map<String, Object>> getMovieTheatresByMovieNameAndCity(int movieId, String movieName, Date showDate,
			String cityName) {
		List<Map<String, Object>> theatreShows = new ArrayList<>();
		List<Theatre> theatres = getTheatresByCity(citiesRepository.findCityIdByCityName(cityName).get(0));
		System.out.println("Theatres in TheatreService:" + theatres);
		for (Theatre theatre : theatres) {
			List<Screen> screens = screensRespository.getScreenByTheatreId(theatre.getTheatreId());
			System.out.println("Screens in TheatreService:" + screens);
			for (Screen screen : screens) {
				List<Show> shows = screen.getShows();
				System.out.println("Shows in TheatreService:" + shows);
				if (shows != null && shows.size() > 0) {
					Map<String, Object> theatreShow = new HashMap<>();
					theatreShow.put("theatreName", theatre.getTheatreName());
					theatreShow.put("movieName", movieName);
					theatreShow.put("shows", shows);
					theatreShows.add(theatreShow);
				}
			}
		}
		return theatreShows;
	}

	public List<Theatre> getTheatresByCity(int cityId) {
		return theaterRepository.getTheatresByCityId(cityId);
	}

	@Override
	public Theatre createTheatre(Theatre theatre) {
		return theaterRepository.save(theatre);
	}
}
