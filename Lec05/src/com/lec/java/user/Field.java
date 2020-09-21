package com.lec.java.user;

import java.util.ArrayList;

public class Field {
	// ���� DB
	ArrayList<User> users = new ArrayList<>();
	
	// ��ĪŰ
	private final int KEY = 3;
	
	// �ߺ�üũ
	// �ܺο��� ���޹��� id�� ����� users�� �ִ� �� ȸ���� ���̵�
	// �ݺ��ؼ� �˻��Ѵ�.
	public User checkId(String id) {
		User user = null;
		// ��ϵ� ȸ������ŭ �ݺ��Ѵ�.
		for (int i = 0; i < users.size(); i++) {
			// �� ȸ������ ���̵� ������ �� �� ���� ���� id�� ���Ѵ�.
			if(users.get(i).getId().equals(id)) {
				// ���� ���� ���̵� �ִٸ� �ش� ��ü�� user�� ����ش�.
				user = users.get(i);
			}
		}
		// null ���Ͻ� �ߺ� ����, null�� �ƴ� �� �ߺ� ����.
		return user;
	}
	
	// ȸ������
	// �ܺο��� ȸ�����Խ� �ۼ��� �������� User Ÿ���� ��ü�� ���޹޴´�.
	public void join(User user) {
		/*
		 * ���⼭ ���̵� �ߺ� �˻縦 �ϰԵǸ� ����ڰ� �ſ� ����������.
		 * 
		 * �ֳ��ϸ�...! 
		 * ���� �Է� �� ���̵� �ߺ� �˻簡 ����ǰ�,
		 * ���� ���̵� �ߺ���ٸ� �ٽ� �Է��ؾ��ϴµ� 
		 * �̹� �Է��� ������ �ٽ� �Է��ؾ� �ϴ� ���� ����� ���忡�� �ſ� ���ŷο� ���̴�.
		 * 
		 * �̷��� ���ŷο��� �ؼ��ϱ� ���ؼ��� main���� ���̵� �Է��� ������ ���̵� �ߺ� üũ�ϰ�
		 * �ߺ��� ������ join()�� ���� ȸ�����Ե� �� �ֵ��� ó���ϸ� �ȴ�.
		 */
		// �Է��� ���̵� �ߺ��� ���� �� null
		//if(checkId(user.getId()) == null) {
		//	user.setPw(encrypt(user.getPw()));
		//	users.add(user);
		//}
		user.setPw(encrypt(user.getPw()));
		users.add(user);
	}
	
	// �α���
	// �ܺο��� ����ڰ� �Է��� ���̵�� ��й�ȣ�� ���޹޴´�.
	public boolean login(String id, String pw) {
		// �Է��� id�� ����ҿ� �ִ��� �˻��Ѵ�.
		User user = checkId(id);
		
		// user�� null�� �ƴ϶�� �����ϴ� ���̵��̴�.
		if(user != null) {
			// �� ���̵� ���� �մ� ȸ���� ��й�ȣ�� ����ڰ� �Է��� ��й�ȣ�� ������ true
			if(decrypt(user.getPw()).equals(pw)) {
				return true;
			}
		}
		// ���̵� �Ǵ� ��й�ȣ ������ false ����
		return false;
	}
	
	// ��й�ȣ�� ��ĪŰ ��ȣ�� ����
	// ��ȣȭ
	public String encrypt(String pw) {
		String en_pw = "";
		
		for (int i = 0; i < pw.length(); i++) {
			en_pw += (char)(pw.charAt(i) * KEY);
		}
		return en_pw;
	}
	
	// ��ȣȭ
	public String decrypt(String en_pw) {
		String de_pw = "";
		
		for (int i = 0; i < en_pw.length(); i++) {
			de_pw += (char)(en_pw.charAt(i) / KEY);
		}
		return de_pw;
	}
}