package com.lec.java.user;

import java.util.Scanner;

public class Form {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Field user_field = new Field();
		
		User user = null;
		
		int choice = 0;
		
		String id = null;
		String pw = null;
		
		while(true) {
			System.out.println("1.ȸ������\n2.�α���\n3.����");
			choice = sc.nextInt();
			
			if(choice == 3) {break;}
			
			switch(choice) {
			// ȸ������
			case 1:
				user = new User();
				
				// ������� ���ŷο��� ���̱� ���� main���� ���̵� �ߺ� �˻縦 �Ѵ�.
				// �ߺ��� ���̵� �������� �ش� �ݺ����� ���� �� �� �ִ�.
				while(true) {
					System.out.print("���̵� : ");
					id = sc.next();
					if(user_field.checkId(id) == null) {break;}
					else {System.out.println("�ߺ��� ���̵��Դϴ�.");}
				}
				user.setId(id);
				System.out.print("��й�ȣ : ");
				user.setPw(sc.next());
				
				user_field.join(user);
				break;
			// �α���
			case 2:
				System.out.print("���̵� : ");
				id = sc.next();
				System.out.print("��й�ȣ : ");
				pw = sc.next();
				
				if(user_field.login(id, pw)) {System.out.println("�α��� ����!");}
				else {System.out.println("�α��� ����");}
				break;
			// �� ��
			default:
				System.out.println("�ٽ�");
			}
		}
	}
}