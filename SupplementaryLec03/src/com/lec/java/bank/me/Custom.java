package com.lec.java.bank.me;

import java.util.Scanner;

public class Custom {
	
	public static void main(String[] args) {
		Bank[] bank = {new Kookmin(), new Shinhan(), new Woori()};
		
		while(true) {
			System.out.println("� �����ΰ���?");
			System.out.println("1.��������\n2.��������\n3.�츮����\n4.������");
			int choice = new Scanner(System.in).nextInt();
			
			if(choice == 4) {break;}
			
			
			switch (choice) {
			case 1:
			case 2:
			case 3:
				int money = 0;
				System.out.println("� �۾��� ���Ͻó���?");
				System.out.println("1.�Ա�\n2.���\n3.��ȸ");
				
				int work = new Scanner(System.in).nextInt();
				switch (work) {
				case 1:
					System.out.println("�� �Ա��ҷ�?");
					money = new Scanner(System.in).nextInt();
					bank[choice-1].deposit(money);
					break;
				case 2:
					System.out.println("�� ����ҷ�?");
					money = new Scanner(System.in).nextInt();
					bank[choice-1].withdraw(money);
					break;
				case 3:
					System.out.println(bank[choice-1].showBalance());
					break;
	
				default:
					System.out.println("�۾��� �߸� �Է��ϼ̽��ϴ�.");
					continue;
				}
				break;
			default:
				System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
			
		} // end while()
		
		System.out.println("���α׷� ����");
	} // end main()

} // end class