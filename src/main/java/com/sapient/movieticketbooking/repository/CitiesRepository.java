package com.sapient.movieticketbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sapient.movieticketbooking.model.City;

@Repository
public interface CitiesRepository extends JpaRepository<City, Integer>{

	@Query("SELECT c.cityId FROM City c WHERE c.cityName =:cityName")
	public List<Integer> findCityIdByCityName(@Param("cityName") String cityName);
}
