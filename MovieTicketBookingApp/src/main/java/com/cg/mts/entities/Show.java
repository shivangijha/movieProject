package com.cg.mts.entities;

import java.time.LocalTime;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Show {
	@Id
	private int showId;
	private LocalTime showStartTime;
	private LocalTime showEndTime;
	private String showName;
	private Movie movie;
	private int screenId;
	private int theatreId;

	public Show() {
		super();
	}

	public Show(int showId, LocalTime showStartTime, LocalTime showEndTime, String showName, Movie movie, int screenId,
			int theatreId) {
		super();
		this.showId = showId;
		this.showStartTime = showStartTime;
		this.showEndTime = showEndTime;
		this.showName = showName;
		this.movie = movie;
		this.screenId = screenId;
		this.theatreId = theatreId;
	}

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public LocalTime getShowStartTime() {
		return showStartTime;
	}

	public void setShowStartTime(LocalTime showStartTime) {
		this.showStartTime = showStartTime;
	}

	public LocalTime getShowEndTime() {
		return showEndTime;
	}

	public void setShowEndTime(LocalTime showEndTime) {
		this.showEndTime = showEndTime;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public int getScreenId() {
		return screenId;
	}

	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}

	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
}
