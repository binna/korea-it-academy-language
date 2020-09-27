package com.lec.java.bakery.me;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Bakery {
	public static void main(String[] args) {
		BreadMaker maker = new BreadMaker();
		
		String[] arButton = {"빵 먹기", "나가기"};
		
		Thread maker_thread = new Thread(maker);
		
		ImageIcon icon = new ImageIcon("src/img/breadMe.gif");
		
		maker_thread.start();
		
		while(true) {
			int choice = JOptionPane.showOptionDialog(null, "", "파리바게트", JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE, icon, arButton, null);
			
			if(choice == 0) {
				maker.bread.eatBread();
			} else {
				break;
			}
		}
	}
}