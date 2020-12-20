package com.lec.java.ch7;

class CaptionTv extends Tv {
	boolean caption;	// ĸ�ǻ���(on/off)
	
	void displayCaption(String text) {
		if(caption) {	// ĸ�� ���°� on(true)�� ���� text�� �����ش�.
			System.out.println(text);
		}
	} // end displayCaption()
	
} // end CaptionTv class

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		
		ctv.channel = 10;	// ����Ŭ�����κ��� ��ӹ��� ���
		ctv.channelUp();	// ����Ŭ�����κ��� ��ӹ��� ���
		System.out.println(ctv.channel);

		System.out.println("---------------------------");
		// ĸ��(�ڸ�) ��� ���� ����
		System.out.println("caption : " + ctv.caption);
		ctv.displayCaption("Hello, World");
		
		System.out.println("---------------------------");
		ctv.caption = true;	// ĸ��(�ڸ�) ����� �Ҵ�.
		
		// ĸ��(�ڸ�) ��� ���� ����
		System.out.println("caption : " + ctv.caption);
		ctv.displayCaption("Hello, World");
		
	} // end main()
	
} // end CaptionTvTest class