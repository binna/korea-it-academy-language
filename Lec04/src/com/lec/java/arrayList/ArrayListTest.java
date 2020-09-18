package com.lec.java.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {
		// ArrayList�� �ַ� ���̻翡 List�� ���̰ų� ���������� ����.
		// ��) dataList Ȥ�� datas
		ArrayList<Integer> dataList = new ArrayList<>();
		
		System.out.println("dataList.size() : " + dataList.size());
		dataList.add(10);
		dataList.add(80);
		dataList.add(90);
		dataList.add(30);
		dataList.add(20);
		dataList.add(50);
		dataList.add(40);
		System.out.println("dataList.size() : " + dataList.size());
		
		// for���� �̿��Ͽ� ����ϱ�
		for(int i = 0; i < dataList.size(); i++) {
			System.out.println(dataList.get(i));
		}
		// for���� �̿��Ͽ� ����ص� �ǳ� 
		// �÷����� toString()�� �������߱� ������ 
		// ���� ���ŷο� for�� ��� toString()�� ����ϸ� ���ϰ� ����� �� �ִ�.
		System.out.println(dataList);
		
		// Collection : �������̽�
		// Collections : Ŭ����
		Collections.sort(dataList);
		System.out.println(dataList);
		
		Collections.shuffle(dataList);
		System.out.println(dataList);
	}
	
}