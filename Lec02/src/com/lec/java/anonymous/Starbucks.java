package com.lec.java.anonymous;

public class Starbucks {
	
	String[] menus;
	
	void regist(Cafe c) {
		menus = c.getMenu();
		
		System.out.println("------------축 개업------------");
		for (int i = 0; i < menus.length; i++) {
			System.out.println(menus[i]);
		}
		
		c.sell("아메리카노");
		
	} // end regist()

} // end class