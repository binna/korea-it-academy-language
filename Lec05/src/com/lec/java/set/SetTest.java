package com.lec.java.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		// public interface Set<E> extends Collection<E>
		
		// �� Set���� �����ϰ� ������ HashSet���� ����������?
		// Up Casting �̿�, HashSet ���� �ٸ� Set�� �̿��� �� �ֱ� ������...!
		Set<String> bloodTypeSet = new HashSet<>();
		
		bloodTypeSet.add("A");
		bloodTypeSet.add("B");
		bloodTypeSet.add("O");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		bloodTypeSet.add("AB");
		
		System.out.println(bloodTypeSet);
		System.out.println(bloodTypeSet.size());
		bloodTypeSet.remove("AB");
		System.out.println(bloodTypeSet);
		
		System.out.println(bloodTypeSet.contains("A"));
		
		// set�� ������ �ο��ؾ� ������ �� ����, ������ �ο��ϴ� ���� ���̻� set�� �ƴϴ�!
		// set�� �ƴϸ� ����? Iterator<String>��.
		Iterator<String> iter = bloodTypeSet.iterator();
		
		System.out.println(bloodTypeSet.size() + "\n");
		//System.out.println(iter.next());
		//System.out.println(iter.next());
		//System.out.println(iter.next());
		//System.out.println(iter.next());	// ���� : NoSuchElementException
		
		// �ȿ� �󸶳� ����ִ��� �ľ��ϱ� ��Ʊ� ������ 
		// ���� �ڵ� ����(NoSuchElementException)�� �߻� ���ɼ��� ����
		// ��, �� ���� �ݺ��ؾ����� �𸦶� �Ʒ��� �ڵ带 �̿��Ͽ� ����ϸ� 
		// NoSuchElementException ������ ���� ����
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}