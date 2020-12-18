package com.lec.java.farm.teacher;

public class Tomato extends Plant {
	
	public Tomato(int cnt, String name, long time) {
		super(cnt, name, time);
	}

	@Override
	public boolean check(Plant plant) {
		if(plant instanceof Flower) {
			if(plant.cnt >= 2)  {
				return true;
			}
		}
		return false;
	}

}