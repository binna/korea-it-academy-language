package com.lec.java.practice.me;

public class Road {
	
	public static void main(String[] args) {
		// ������ ���� ���
		Nike gangnam = new Nike(); 
		gangnam.regist(new MarketAdapter(){
			
			@Override
			public String[] getMenu() {
				String[] arMenu = {"�ȭ", "������", "����"};
				
				return arMenu;
			}
			
			@Override
			public void sell(String choice) {
				String[] arMenu = getMenu();
				
				System.out.println("������ ������ ��ǰ----------------");
				for(int i = 0; i < arMenu.length; i++) {
					
					if(arMenu[i].equals(choice)) {
						System.out.println(choice + "���� �Ϸ�");
					}
				}
				
			};
			
		});
		
		// ���� ���� ������� ����
		Nike freeSharing = new Nike(); 
		freeSharing.regist(new MarketAdapter(){
			
			@Override
			public String[] getMenu() {
				String[] arMenu = {"�ȭ", "������", "����", "������"};
				
				return arMenu;
			}
			
		});
		
	} // end main()

} // end class