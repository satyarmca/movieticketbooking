package com.sapient.movieticketbooking.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.movieticketbooking.model.Show;

@Repository
public interface ShowsRepository extends JpaRepository<Show, Integer>{
 public List<Show> getShowsByScreenIdAndMovieIdAndShowDate(int screenId, int movieId, Date showDate);
 
 public List<Show> findByShowIdIn(List<Integer> showIds);
}
