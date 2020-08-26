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
			System.out.println("ù��°");
			break;
		case "2":
			System.out.println("�ι�°");
			break;
		}
	}
	
	public ButtonTest() {
		super("��ư �׽�Ʈ");				// title��, ����ǥ���ٿ� "��ư �׽�Ʈ" �̸� ����
		setBounds(580, 150, 500, 500);	// �� â�� ũ��
		
		// ��ư 2�� �߰�
		Button btn1 = new Button("1");
		Button btn2 = new Button("2");
		setLayout(new FlowLayout());
		add(btn1);
		add(btn2);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		// �� �����!(��, ������ �����ϰ� �����) > ������ ������ָ� ��
		// �׷��� �����ʸ� ������ָ� ��� ����������ϴϱ� 
		// �Ϻθ� �����ϱ� ���� Adapter, �͸�Ŭ���� �̿��Ͽ� ���� ������ �����ϵ��� ����
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setVisible(true);				// â�� ���� ���̰� �Ϸ��� true�� �����
	}

	public static void main(String[] args) {
		new ButtonTest();
	} // end main()
	
} // end class