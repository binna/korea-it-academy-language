package com.lec.java.ch11;

import java.util.*;

public class ArrayListEx1 {
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
	} // end print()

	public static void main(String[] args) {
		// ũ�Ⱑ 10�� ArrayList�� ����
		ArrayList list1 = new ArrayList(10);
		
		// list1�� ������ 5, 4, 2, 0, 1, 3 �߰�
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		// subList�� �̿�, list1�� ù��° �� ~ �׹�° ���� ��(4, 2, 0)�� ������ list2�� ����
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		// Collections.sort�� �̿�, list1�� list2�� ����
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		// containsAll�� �̿�, list2�� list1�� ���ԵǾ� �ִ��� Ȯ��
		// list1�� list2�� ��� ��Ҹ� �����ϰ� ���� ���� true
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2)); 
		
		// list2�� B�� C, ����° �濡 A�� �߰�
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);
		
		// set�� �̿�, �ι�° ���� ���� "AA"�� ����
		list2.set(2, "AA");
		print(list1, list2);
		
		// list1�� ����� ��ü �߿��� list2�� ����� �͵鸸 ����� �������� ����
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		print(list1, list2);
		
		// list2���� list1�� ���Ե� ��ü���� ����
		for(int i = list2.size() - 1; i >= 0; i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list1, list2);
	} // end main()
	
} // end class