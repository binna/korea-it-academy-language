package com.lec.java.user;

import java.util.ArrayList;

public class Field {
	// ���� DB
	ArrayList<User> users = new ArrayList<>();
	// vs �ܺ� DB : oracle DB, MariaD, MySQL ��
	
	// �ߺ�üũ
	public User checkId(String id) {
		User user = null;
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getId().equals(id)) {
				user = users.get(i);
			}
		}
		return user;
	}
	
	// ȸ������
	public void join(User user) {
		if(checkId(user.getId()) == null) {
			users.add(user);
		}
	}
	
	// �α���
	
	// ��ȣȭ
	
	// ��ȣȭ

}