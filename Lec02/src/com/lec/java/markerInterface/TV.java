package com.lec.java.markerInterface;

// 많은 비디오 영상들 중에 애니메이션만 추출하고 싶다.
// 마커 인터페이스를 이용
// 애니메이션인지 아닌지 판단하는 메소드 만듦
public class TV {
	
	//외부에서 전달받은 영상 목록 중 애니메이션인지 아닌지 판단하는 메소드
	public void checkAni(Video[] arVideo) {
		for (int i = 0; i < arVideo.length; i++) {
			if(arVideo[i] instanceof Animation) {
				System.out.println("애니메이션 입니다.");
			}else {
				System.out.println("애니메이션이 아닙니다.");
			}
		}
	} // end checkAni()
	
	public static void main(String[] args) {
		
		Video[] arVideo = {
				new Ddolbee(),	// Up-Casting
				new Bbororo(),	// Up-Casting
				new RunHanee(),	// Up-Casting	
				new Titanic()	// Up-Casting
		};
		
		new TV().checkAni(arVideo);
		
	} // end main()
	
} // end class