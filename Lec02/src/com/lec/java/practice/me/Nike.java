package com.lec.java.practice.me;

public class Nike {

	String[] menus;
	
	void regist(Market m) {
		menus = m.getMenu();
		
		System.out.println("------------�� ����------------");
		for(int i = 0; i < menus.length; i++) {
			System.out.println(menus[i]);
		}
		
		m.sell("�ȭ");
		
	} // end regist()

} // end class