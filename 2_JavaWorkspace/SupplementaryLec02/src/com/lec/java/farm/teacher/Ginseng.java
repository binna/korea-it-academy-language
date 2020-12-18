package com.lec.java.farm.teacher;

// 인삼
public class Ginseng extends Plant {

	public Ginseng(int cnt, String name, long time) {
		super(cnt, name, time);
	}
	
	@Override
	public boolean check(Plant plant) {
		if(plant instanceof Potato) {
			if(plant.cnt >= 20) {
				return true;
			}
		}
		return false;
	}

}