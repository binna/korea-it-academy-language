package com.lec.java.practice.teacher;

public class Road {
	
	public static void main(String[] args) {
		Nike gangnam = new Nike();
		Nike jamsil = new Nike();
		
		jamsil.regist(new MarketAdapter() {
			@Override
			public String[] getMenu() {
				String[] arMenu = {"�ȭ", "������", "����", "�౸��"};
				
				return arMenu;
			}
		});
		
		gangnam.regist(new Market() {
			
			@Override
			public void sell(String choice) {
				String[] arMenu = getMenu();
				
				System.out.println("������ ������ ��ǰ----------------");
				for(int i = 0; i < arMenu.length; i++) {
					
					if(arMenu[i].equals(choice)) {
						System.out.println(choice + " ���� �Ϸ�");
					}
				}
			}
			
			@Override
			public String[] getMenu() {
				String[] arMenu = {"�ȭ", "������", "����", "�౸��"};
				
				return arMenu;
			}
		});
		
	}
}