package com.sapient.movieticketbooking.model;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "shows")
public class Show {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int showId;

	@Column()
	private Date showDate;

	@Column()
	private Timestamp startTime;
	@Column()
	private Timestamp endTime;
	@Column()
	private int screenId;
	@Column()
	private int movieId;

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public Date getShowDate() {
		return showDate;
	}

	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	@Override
	public String toString() {
		return "Show [showId=" + showId + ", showDate=" + showDate + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", screenId=" + screenId + ", movieId=" + movieId + "]";
	}
	
	

}
