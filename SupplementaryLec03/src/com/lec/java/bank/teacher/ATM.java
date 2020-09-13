package com.lec.java.bank.teacher;

import java.util.Random;
import java.util.Scanner;

public class ATM {
	// �ҽ��ڵ� ����ȭ
	public void useAtm() {
		// ���ະ �ִ� 100���� �� ���� ����
		Kookmin[] arKookmin = new Kookmin[100];
		Shinhan[] arShinhan = new Shinhan[100];
		Woori[] arWoori = new Woori[100];
		
		// �� ���ະ ���� ������ ���� �� �ְ� 100���� �ʵ徿 �޸𸮿� �Ҵ�
		for(int i = 0; i < arKookmin.length; i++) {
			arKookmin[i] = new Kookmin();
			arShinhan[i] = new Shinhan();
			arWoori[i] = new Woori();
		}
		
		// �� ���� �迭�� ���� 2���� �迭
		Bank[][] arrBank = {arKookmin, arShinhan, arWoori};
		
		String msg = "������ ������.\n1.��������\n2.��������\n3.�츮����\n4.������";
		String optionMsg = "1.���°���\n2.�Ա��ϱ�\n3.����ϱ�\n4.�ܾ���ȸ\n5.���ư���";
		String errMsg = "�ٽ� �õ����ּ���.";
		
		String name = null;
		String account = null;
		String pw = null;
		String phone = null;
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int choice = 0;
		int optionChoice = 0;
		
		// ���ະ ȸ�� ��
		int[] arUserCnt = {Kookmin.cnt, Shinhan.cnt, Woori.cnt};
		
		// ���¹�ȣ �ߺ��˻翡 ���� flag
		boolean check = false;
		
		while(true) {
			System.out.println(msg);
			// �����ȣ(1���� ����)
			choice = sc.nextInt();
			
			// ������
			if(choice == 4) {break;}
			
			while(true) {
				System.out.println(optionMsg);
				optionChoice = sc.nextInt();
				
				// ���ư���
				if(optionChoice == 5) {break;}
				
				switch (optionChoice) {
				// ���� ����(������, ���¹�ȣ, ��й�ȣ, �޴�����ȣ)
				case 1:
					System.out.print("������ : ");
					name = sc.next();
					
					// ���¹�ȣ�� 6�ڸ� �ߺ����� ����
					// 100000 ~ 999999
					// 0 ~ 899999 + 100000
					do {
						// �ߺ� ���� Ȯ�� flag
						check = false;
						account = (r.nextInt(900000) + 100000) + "";
						// �ߺ��˻�
						for(int i = 0; i < arrBank.length; i++) {
							// arUserCnt[i] : �ش� ������ ȸ�� ��
							for(int j = 0; j < arUserCnt[i]; j++) {
								if(arrBank[i][j].account.equals(account)) {
									// �ߺ��� check�� true
									check = true;
								}
							}
						}
					// �ߺ����� ���� ������ ���ѹݺ�
					} while(check);
					
					do {
						System.out.print("������ ��й�ȣ 4�ڸ� : ");
						pw = sc.next();
					} while(pw.length() != 4);	// ��й�ȣ�� 4�ڸ��̸� Ż��
					
					while(true) {
						System.out.print("�޴��� ��ȣ(-����) : ");
						phone = sc.next();
						try {
							// �޴��� ��ȣ�� ������ ����ȯ�� ������ �߻����� �ʴ´ٸ� ���� �Է�
							Integer.parseInt(phone);
							// �����Է½� break �ߵ�
							break;
						} catch (NumberFormatException e) {
							// ���� �Է��� �ƴҽ� ���ܰ� �߻��Ͽ� ����
							System.out.println("���ڸ� �Է��� �� �ֽ��ϴ�.");
						}
					}
					
					// �ű� �� �ʵ��� �ּҸ� temp�� ��Ƶд�.
					// [��] choice - 1 : ����ڰ� ������ ����
					// [��] arUserCnt[choice - 1] : ����ڰ� ������ ������ ȸ�� ��(6�϶� 6��° �ε����� �ű� ȸ�� �ڸ�)
					Bank temp = arrBank[choice - 1][arUserCnt[choice - 1]];

					temp.name = name;
					temp.account = account;
					temp.pw = pw;
					temp.phone = phone;

					System.out.println("�������մϴ١�");
					System.out.println(name + "���� ���¹�ȣ : " + account);
					System.out.println("�������� ���� �̿� �����մϴ�^^");
					
					// ���� �Ϸ�� �ش� ���� ȸ�� �� 1����
					arUserCnt[choice - 1]++;
					break;
					
				// ���¹�ȣ�� ��й�ȣ�� �Է��ؾ� �Աݰ� ���, �ܾ� ���񽺸� �̿��� �� �ִ�.
				// �Ա��ϱ�
				case 2:
					System.out.print("���¹�ȣ : ");
					account = sc.next();
					
					System.out.print("��й�ȣ : ");
					pw = sc.next();
					
					// arUserCnt[choice - 1] : �ش� ������ ȸ����ŭ�� �ݺ�
					for(int i = 0; i < arUserCnt[choice - 1]; i++) {
						// �α��� �˻�
						if(arrBank[choice - 1][i].account.equals(account)
								&& arrBank[choice - 1][i].pw.equals(pw)) {
							// �α��� ������ check�� true
							check = true; 
							System.out.print("�Աݾ� : ");
							arrBank[choice - 1][i].deposit(sc.nextInt());
							// �Ա� �� ���� �ܾ�ǥ��
							System.out.println("���� �ܾ��� " + arrBank[choice - 1][i].money + "��");
							break;
						}
					}
					if(!check) {
						System.out.println("���¹�ȣ Ȥ�� ��й�ȣ�� Ȯ�����ּ���");
					}
					break;
				// ����ϱ�
				case 3:
					System.out.print("���¹�ȣ : ");
					account = sc.next();
					
					System.out.print("��й�ȣ : ");
					pw = sc.next();
					
					// arUserCnt[choice - 1] : �ش� ������ ȸ����ŭ�� �ݺ�
					for(int i = 0; i < arUserCnt[choice - 1]; i++) {
						// �α��� �˻�
						if(arrBank[choice - 1][i].account.equals(account)
								&& arrBank[choice - 1][i].pw.equals(pw)) {
							// �α��� ������ check�� true
							check = true; 
							System.out.print("��ݾ� : ");
							if(arrBank[choice - 1][i].withdraw(sc.nextInt())) {
								// ��� �� ���� �ܾ�ǥ��
								System.out.println("���� �ܾ��� " + arrBank[choice - 1][i].money + "��");
							} else {
								System.out.println("��� ���� / �ܾ� ����");
							}
							break;
						}
					}
					if(!check) {
						System.out.println("���¹�ȣ Ȥ�� ��й�ȣ�� Ȯ�����ּ���");
					}
					break;
				// �ܾ���ȸ
				case 4:
					System.out.print("���¹�ȣ : ");
					account = sc.next();
					
					System.out.print("��й�ȣ : ");
					pw = sc.next();
					
					// arUserCnt[choice - 1] : �ش� ������ ȸ����ŭ�� �ݺ�
					for(int i = 0; i < arUserCnt[choice - 1]; i++) {
						// �α��� �˻�
						if(arrBank[choice - 1][i].account.equals(account)
								&& arrBank[choice - 1][i].pw.equals(pw)) {
							// �α��� ������ check�� true
							check = true; 
							System.out.println("������ : " + arrBank[choice - 1][i].name);
							System.out.println("���¹�ȣ : " + arrBank[choice - 1][i].account);
							System.out.println("���� �ܾ��� " + arrBank[choice - 1][i].showBalance() + "��");
							break;
						}
					}
					if(!check) {
						System.out.println("���¹�ȣ Ȥ�� ��й�ȣ�� Ȯ�����ּ���");
					}
					break;
				default:
					System.out.println(errMsg);
				}
			}
		}
	} // end main()

} // end class