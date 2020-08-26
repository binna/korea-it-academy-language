package com.lec.java.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest extends Frame implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case "1":
			System.out.println("첫번째");
			break;
		case "2":
			System.out.println("두번째");
			break;
		}
	}
	
	public ButtonTest() {
		super("버튼 테스트");				// title명, 제목표시줄에 "버튼 테스트" 이름 설정
		setBounds(580, 150, 500, 500);	// 뜰 창의 크기
		
		// 버튼 2개 추가
		Button btn1 = new Button("1");
		Button btn2 = new Button("2");
		setLayout(new FlowLayout());
		add(btn1);
		add(btn2);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		// 귀 만들기!(즉, 반응에 반응하게 만들기) > 리스터 만들어주면 됨
		// 그러나 리스너를 만들어주면 모두 설정해줘야하니깐 
		// 일부만 설정하기 위해 Adapter, 익명클래스 이용하여 종료 엑션이 동작하도록 만듦
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setVisible(true);				// 창이 눈에 보이게 하려면 true를 줘야함
	}

	public static void main(String[] args) {
		new ButtonTest();
	} // end main()
	
} // end class