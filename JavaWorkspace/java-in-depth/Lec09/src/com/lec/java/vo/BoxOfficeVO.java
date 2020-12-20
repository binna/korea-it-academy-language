package com.lec.java.vo;

// Model
public class BoxOfficeVO {
	// 여러 줄 수정하고 싶을때는 Alt + Shift + A,
	// 범위를 늘리고 싶을때는 Shift
	private int rating;
	private String film_name;
	private String release_date;
	private long income;
	private int geust_cnt;
	private int screen_cnt;
	
	
	public BoxOfficeVO() {;}

	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getFilm_name() {
		return film_name;
	}
	public void setFilm_name(String film_name) {
		this.film_name = film_name;
	}

	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public long getIncome() {
		return income;
	}
	public void setIncome(long income) {
		this.income = income;
	}

	public int getGeust_cnt() {
		return geust_cnt;
	}
	public void setGeust_cnt(int geust_cnt) {
		this.geust_cnt = geust_cnt;
	}

	public int getScreen_cnt() {
		return screen_cnt;
	}
	public void setScreen_cnt(int screen_cnt) {
		this.screen_cnt = screen_cnt;
	}
}