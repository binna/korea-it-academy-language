package com.lec.java.bank.me;

import java.util.Scanner;

public class Custom {
	
	public static void main(String[] args) {
		Bank[] bank = {new Kookmin(), new Shinhan(), new Woori()};
		
		while(true) {
			System.out.println("어떤 은행인가요?");
			System.out.println("1.국민은행\n2.신한은행\n3.우리은행\n4.나가기");
			int choice = new Scanner(System.in).nextInt();
			
			if(choice == 4) {break;}
			
			
			switch (choice) {
			case 1:
			case 2:
			case 3:
				int money = 0;
				System.out.println("어떤 작업을 원하시나요?");
				System.out.println("1.입금\n2.출금\n3.조회");
				
				int work = new Scanner(System.in).nextInt();
				switch (work) {
				case 1:
					System.out.println("얼마 입금할래?");
					money = new Scanner(System.in).nextInt();
					bank[choice-1].deposit(money);
					break;
				case 2:
					System.out.println("얼마 출금할래?");
					money = new Scanner(System.in).nextInt();
					bank[choice-1].withdraw(money);
					break;
				case 3:
					System.out.println(bank[choice-1].showBalance());
					break;
	
				default:
					System.out.println("작업을 잘못 입력하셨습니다.");
					continue;
				}
				break;
			default:
				System.out.println("은행을 잘못 입력하셨습니다.");
				continue;
			}
			
		} // end while()
		
		System.out.println("프로그램 종료");
	} // end main()

} // end class