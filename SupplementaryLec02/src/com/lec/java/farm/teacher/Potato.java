package com.lec.java.farm.teacher;

public class Potato extends Plant {

	public Potato(int cnt, String name, long time) {
		super(cnt, name, time);
	}
	
	@Override
	public boolean check(Plant plant) {
		if(plant instanceof Potato) {
			if(plant.cnt >= 5) {
				return true;
			}
		}
		return false;
	}
}