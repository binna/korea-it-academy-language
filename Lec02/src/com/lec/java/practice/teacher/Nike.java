package com.lec.java.practice.teacher;

public class Nike {
	String[] menus;
	
	void regist(Market m) {
		menus = m.getMenu();
		
		System.out.println("------------�޴���-----------");
		for (int i = 0; i < menus.length; i++) {
			System.out.println(menus[i]);
		}
		
		if(!(m instanceof MarketAdapter)) {
			m.sell("�౸��");
		}
	}
}