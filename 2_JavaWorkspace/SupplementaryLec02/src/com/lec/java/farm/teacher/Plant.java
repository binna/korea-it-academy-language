package com.lec.java.farm.teacher;

public abstract class Plant {
	public int cnt;
	public String name;
	public long time;
	
	public Plant() {}
	public Plant(int cnt, String name, long time) {
		super();
		this.cnt = cnt;
		this.name = name;
		this.time = time;
	}

	// up casting
	public boolean check(Plant plant) {return false;}
	
	public void grow() {cnt++;}
}