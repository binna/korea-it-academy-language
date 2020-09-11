package com.lec.java.farm.me;

import java.util.Scanner;

public class ShineFarm {
	
	public static void main(String[] args) {
		String mainMsg = "shineFarm ���忡 ���� ���� ȯ���մϴ�.\n"
				+ "[�۹��� ����ؼ� �پ��� ��ǰ���� ��ȯ����!]";
		
		System.out.println(mainMsg);
		
		// ���� �������ڸ��� ��� �۹��� Ŭ�������� �������� ��
		// ���� ��� Ŭ������ ���� ������̶� ���� �λ︸ ����ϸ� ��� Ŭ������ �������� ����
		Ginseng playItem = new Ginseng();
		
		while(true) {
			System.out.println("1.�۹� ����\n2.�� �۹� ����\n3.����\n4.�׸��ϱ�");
			String choice = new Scanner(System.in).next();
			
			// �׸��ϱ�
			if(choice.equals("4")) {
				System.out.println("�׸��νø� ���ݱ��� �� ���� ���� �ȵ˴ϴ�.\n���� �׸��νðڽ��ϱ�(���ϸ� yes ����)?");
				if((new Scanner(System.in).next()).equals("yes"));
				break;
			}
			
			switch(choice) {
			// �۹� ����
			case "1":
				System.out.println("Ű��� ���� �۹��� �����ϼ���.");
				System.out.println("1.��\n2.�丶��\n3.����\n4.�λ�");
				choice = new Scanner(System.in).next();
				switch (choice) {
				case "1":
					playItem.growFlower();
					break;
				case "2":
					if(playItem.flower >= 2) {
						playItem.growTomato();
						playItem.flower -= 2;
					} else {
						System.out.println("���� 2�� �̻��϶��� �丶�並 Ű�� �� �ֽ��ϴ�!");
						System.out.println("���� ���� ���� : " + playItem.flower);
					}
					break;
				case "3":
					if(playItem.tomato >= 5) {
						playItem.growPotato();
						playItem.tomato -= 5;
					} else {
						System.out.println("�丶�䰡 5�� �̻��϶��� ���ڸ� Ű�� �� �ֽ��ϴ�!");
						System.out.println("���� �丶���� ���� : " + playItem.tomato);
					}
					break;
				case "4":
					if(playItem.potato >= 20) {
						playItem.growGinseng();
						playItem.potato -= 20;
					} else {
						System.out.println("���ڰ� 20�� �̻��϶��� �λ��� Ű�� �� �ֽ��ϴ�!");
						System.out.println("���� ������ ���� : " + playItem.potato);
					}
					break;
				default:
					System.out.println("�߸��� ���� �Է��Ͽ� �۹��� Ű���� ���߽��ϴ�.");
					continue;
				}
				break;
			// �� �۹� ����
			case "2":
				System.out.println("�� : " + playItem.flower 
						+ "��, �丶�� : " + playItem.tomato 
						+  "��, ���� : " + playItem.potato 
						+ "��, �λ� : " + playItem.ginseng + "��");
				break;
			// ����
			case "3":
				System.out.println("� ��ǰ�� �ް� �����ʴϱ�?");
				System.out.println("1.���� ��õ��(�� 3��)\n2.���� ����(�丶�� 3��)\n3.��� ����(���� 3��)\n4.����� �����(�λ� 3��)");
				switch (choice) {
				case "1":
					if(playItem.flower >= 3) {
						System.out.println("���� ��õ�� ����! ��ϵ� �ּҷ� ����ص帮�ڽ��ϴ�~! ��ī ��ī ��!!!");
						playItem.flower -= 3;
					} else {
						System.out.println("���� ������ ��� ���� ������ " + playItem.flower + "���Դϴ�!\n��� �� �ֵ��� �� �� ������ ����ּ���!");
					}
					break;
				case "2":
					if(playItem.tomato >= 3) {
						System.out.println("���� ���� ����! ��ϵ� �ּҷ� ����ص帮�ڽ��ϴ�~! ��ī ��ī ��!!!");
						playItem.tomato -= 3;
					} else {
						System.out.println("���� ������ ��� �丶���� ������ " + playItem.tomato + "���Դϴ�!\n��� �� �ֵ��� �� �� ������ ����ּ���!");
					}
					break;
				case "3":
					if(playItem.potato >= 3) {
						System.out.println("��� ���� ����! ��ϵ� �ּҷ� ����ص帮�ڽ��ϴ�~! ��ī ��ī ��!!!");
						playItem.potato -= 3;
					} else {
						System.out.println("���� ������ ��� ������ ������ " + playItem.potato + "���Դϴ�!\n��� �� �ֵ��� �� �� ������ ����ּ���!");
					}
					break;
				case "4":
					if(playItem.ginseng >= 3) {
						System.out.println("����� ����� ����! ��ϵ� �ּҷ� ����ص帮�ڽ��ϴ�~! ��ī ��ī ��!!!");
						playItem.ginseng -= 3;
					} else {
						System.out.println("���� ������ ��� �λ��� ������ " + playItem.ginseng + "���Դϴ�!\n��� �� �ֵ��� �� �� ������ ����ּ���!");
					}
					break;
				default:
					System.out.println("�߸� �Է��߽��ϴ�. ������ �����ϴ�~ ���� ����~!");
					continue;
				}
				break;
			default:
				System.out.println("�߸��� ���� �Է��߽��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			} // end switch()
			
		}
		System.out.println("��������");
		
	} // end main()

} // end class