package com.sapient.movieticketbooking.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "cities")
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cityId;

	@Column
	private String cityName;

	@Column
	private String state;

	@Column
	private int zipCode;
	
	@OneToMany
	@JoinColumn(name="theatreId", referencedColumnName="cityId")
	private List<Theatre> theatres;

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public City() {
		super();
	}
	
	

}
