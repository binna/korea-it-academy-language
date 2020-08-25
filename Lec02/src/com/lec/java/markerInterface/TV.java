package com.lec.java.markerInterface;

// ���� ���� ����� �߿� �ִϸ��̼Ǹ� �����ϰ� �ʹ�.
// ��Ŀ �������̽��� �̿�
// �ִϸ��̼����� �ƴ��� �Ǵ��ϴ� �޼ҵ� ����
public class TV {
	
	//�ܺο��� ���޹��� ���� ��� �� �ִϸ��̼����� �ƴ��� �Ǵ��ϴ� �޼ҵ�
	public void checkAni(Video[] arVideo) {
		for (int i = 0; i < arVideo.length; i++) {
			if(arVideo[i] instanceof Animation) {
				System.out.println("�ִϸ��̼� �Դϴ�.");
			}else {
				System.out.println("�ִϸ��̼��� �ƴմϴ�.");
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