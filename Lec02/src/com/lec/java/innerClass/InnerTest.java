package com.lec.java.innerClass;

class Out {
	int outData;
	
	public Out() {
		System.out.println("�ܺ� Ŭ���� ������ ȣ���.");
	}
	
	public void intro_out() {
		System.out.println("�ܺ� Ŭ���� �޼ҵ� ȣ���.");
	}
	
	// ����Ŭ����, ĸ��ȭ
	// ����Ŭ������ �ܺ�Ŭ������ ���� �ʵ� �ȿ��� ���� �� �ڽ��� �ƴϴ�.
	// �ڽ��� �ݵ�� extends�� �޴´ٴ� �� �� ����ϱ�!
	class In {
		int inData;
		
		public In() {
			System.out.println("���� Ŭ���� ������ ȣ���.");
		}
		
		public void intro_in() {
			outData = 100;
			System.out.println(outData);
			intro_out();
			System.out.println("���� Ŭ���� �޼ҵ� ȣ���.");
		}
		
	} // end In class
	
} // end Out class

public class InnerTest {
	
	public static void main(String[] args) {
		Out out = new Out();
		
		// �ϴ� �ܺ�Ŭ������ �ν��Ͻ� �Ǿ�� ���� Ŭ������ �ν��Ͻ� �ȴ�..!!
		Out.In in = out.new In();
		
		in.intro_in();
		
	} // end main()

} // end InnerTest class