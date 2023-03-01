package com.sapient.movieticketbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.movieticketbooking.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

	
}
