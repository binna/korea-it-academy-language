package com.lec.java.generic;

// 1. Generic Class
class GnrClass<T> {
	private T data;

	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}

class GnrClass2 {
	// 2. Generic Method
	public static <T> T function(T data) {
		T result;
		
		if(data instanceof Integer) {
			result = (T)"����";
		} else if(data instanceof Double || data instanceof Float) {
			result = (T)"�Ǽ�";
		} else if(data instanceof Character) {
			result = (T)"����";
		} else if(data instanceof String) {
			result = (T)"���ڿ�";
		} else {
			// � �ּҰ��� ���� �� �� ������ null�� �ʱ�ȭ ���ش�.
			// ���׸��� �׻� Ŭ����Ÿ���� �����ޱ� ������ null�� ������ �� �ִ�.
			result = null;
		}
		return result;
	}
}

// 3. Generic Interface
// : �������̽��� ���׸��� �����ϰ� �������� Ŭ�������� Ÿ���� ���Ѵ�.
class GenInterClass implements GerInter<Double, Integer> {
	@Override
	public Double add(Double data1, Double data2) {
		return data1 + data2;
	}

	@Override
	public Double sub(Double data1, Integer data2) {
		return data1 / data2;
	}

	@Override
	public Double mul(Integer data1, Integer data2) {
		return (double)(data1 * data2);
	}
}

public class GnrTest {
	public static void main(String[] args) {
		// 1. Generic Class
		// : Ŭ���� ���ο��� ���� �ڷ����� �����Ѵ�.
		//   Ŭ������ �ڿ��� ���׸��� �����Ѵ�.
		
		// ���׸����� Wrapper Ŭ���� ���·� �ۼ��ؾ� �Ѵ�.
		// ���׸� Ŭ������ �Ʒ��� �ΰ��� ������� �ν��Ͻ� �� �� �ִ�.
		GnrClass<Integer> gc1 = new GnrClass<Integer>();
		GnrClass<Integer> gc2 = new GnrClass<>();
		
		gc1.setData(100);
		System.out.println(gc1.getData());
		
		gc2.setData(200);
		System.out.println(gc2.getData());
		
		System.out.println("======================================");
		// 2.Generic Method
		// : Ŭ������ ���׸��� �������� �ʰ� �޼ҵ忡�� ���׸��� �����ϴ� ���.
		//   �޼ҵ��� �Ű����� �Ǵ� ����Ÿ���� ���׸��̶�� ����Ÿ�� �տ��� ���׸��� �����ؾ� �Ѵ�.
		System.out.println(GnrClass2.function("�ȳ�"));
		System.out.println(GnrClass2.function(4));
		System.out.println(3.4f);
		System.out.println('a');
	}
}