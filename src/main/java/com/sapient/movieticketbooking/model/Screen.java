package com.sapient.movieticketbooking.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "screens")
public class Screen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int screenId;

	@Column
	private String screenName;
	@Column
	private int totalSeats;
	@Column
	private int theatreId;
	
	@OneToMany
	@JoinColumn(name="showId", referencedColumnName="screenId")
	private List<Show> shows;

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	
	

	public List<Show> getShows() {
		return shows;
	}

	public void setShows(List<Show> shows) {
		this.shows = shows;
	}

	@Override
	public String toString() {
		return "Screen [screenId=" + screenId + ", screenName=" + screenName + ", totalSeats=" + totalSeats
				+ ", theatreId=" + theatreId + ", shows=" + shows + "]";
	}
	
	
}
