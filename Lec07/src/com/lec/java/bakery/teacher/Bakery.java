package com.lec.java.bakery.teacher;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Bakery {
	public static void main(String[] args) {
		//BreadMaker maker = new BreadMaker();
		//BreadPlate bread = maker.bread;
		BreadPlate bread = new BreadPlate();
		BreadMaker maker = new BreadMaker(bread);
		
		String[] arButton = {"빵 먹기", "나가기"};
		
		Thread maker_thread = new Thread(maker);
		
		maker_thread.start();
		
		ImageIcon icon = new ImageIcon("src/img/breadTeacher.gif");	// 상대경로
		
		while(true) {
			int choice = JOptionPane.showOptionDialog(null, "", "파리바게트", JOptionPane.DEFAULT_OPTION, 
					JOptionPane.PLAIN_MESSAGE, icon, arButton, null);
			
			if(choice == 0) {
				bread.eatBread();
			} else {
				break;
			}
		}
	}
}