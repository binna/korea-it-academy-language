package com.lec.java.wrapperClass;

public class WrapperClass2 {
	
	public static void main(String[] args) {
		// �ٸ� Ÿ���� �迭�� ���� �� ����.
		// �׷��� �Ʒ��� ����� �̿��ϸ� ���� �� �ִ�.
		Object[] datas = {3, 3.0, 'A', "ABC", true};
		
		// ���� datas�鿡�� ���� ���
		// 1. up-casting
		// 2. auto-boxing
		
		// auto-boxing ������� �ʴ´ٸ�...!!
		Object[] datasNoAuto = {new Integer(3), new Double(3.0),
				new Character('A'), new String("ABC"), new Boolean(true)};
		
		// ���� for��(forEach��, ���� for��)�� �̿��Ͽ� ����� ������ ����ϱ�
		System.out.println("���� for�� : datas");
		for(Object obj : datas) {
			System.out.print(obj + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("���� for�� : datasNoAuto");
		for(Object obj : datasNoAuto) {
			System.out.print(obj + " ");
		}
		
	} // end main()

} // end class