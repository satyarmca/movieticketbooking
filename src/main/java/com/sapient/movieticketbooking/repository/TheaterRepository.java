package com.sapient.movieticketbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.movieticketbooking.model.Theatre;

@Repository
public interface TheaterRepository extends JpaRepository<Theatre, Integer>{
	List<Theatre> getTheatresByCityId(int cityId);
}
