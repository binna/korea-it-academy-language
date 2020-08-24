package com.lec.java.ch7;

class CaptionTv extends Tv {
	boolean caption;	// 캡션상태(on/off)
	
	void displayCaption(String text) {
		if(caption) {	// 캡션 상태가 on(true)일 때만 text를 보여준다.
			System.out.println(text);
		}
	} // end displayCaption()
	
} // end CaptionTv class

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		
		ctv.channel = 10;	// 조상클래스로부터 상속받은 멤버
		ctv.channelUp();	// 조상클래스로부터 상속받은 멤버
		System.out.println(ctv.channel);

		System.out.println("---------------------------");
		// 캡션(자막) 기능 꺼진 상태
		System.out.println("caption : " + ctv.caption);
		ctv.displayCaption("Hello, World");
		
		System.out.println("---------------------------");
		ctv.caption = true;	// 캡션(자막) 기능을 켠다.
		
		// 캡션(자막) 기능 켜진 상태
		System.out.println("caption : " + ctv.caption);
		ctv.displayCaption("Hello, World");
		
	} // end main()
	
} // end CaptionTvTest class