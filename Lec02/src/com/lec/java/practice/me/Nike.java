package com.lec.java.practice.me;

public class Nike {

	String[] menus;
	
	void regist(Market m) {
		menus = m.getMenu();
		
		System.out.println("------------축 개업------------");
		for(int i = 0; i < menus.length; i++) {
			System.out.println(menus[i]);
		}
		
		m.sell("운동화");
		
	} // end regist()

} // end class