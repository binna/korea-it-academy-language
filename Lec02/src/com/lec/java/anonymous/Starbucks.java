package com.lec.java.anonymous;

public class Starbucks {
	
	String[] menus;
	
	void regist(Cafe c) {
		menus = c.getMenu();
		
		System.out.println("------------�� ����------------");
		for (int i = 0; i < menus.length; i++) {
			System.out.println(menus[i]);
		}
		
		c.sell("�Ƹ޸�ī��");
		
	} // end regist()

} // end class