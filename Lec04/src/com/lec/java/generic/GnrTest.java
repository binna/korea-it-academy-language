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
			result = (T)"정수";
		} else if(data instanceof Double || data instanceof Float) {
			result = (T)"실수";
		} else if(data instanceof Character) {
			result = (T)"문자";
		} else if(data instanceof String) {
			result = (T)"문자열";
		} else {
			// 어떤 주소값이 들어올 지 모를 때에는 null로 초기화 해준다.
			// 제네릭은 항상 클래스타입을 지정받기 때문에 null은 대입할 수 있다.
			result = null;
		}
		return result;
	}
}

// 3. Generic Interface
// : 인터페이스에 제네릭을 선언하고 지정받은 클래스에서 타입을 정한다.
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
		// : 클래스 내부에서 사용될 자료형을 지정한다.
		//   클래스명 뒤에서 제네릭을 선언한다.
		
		// 제네릭에는 Wrapper 클래스 형태로 작성해야 한다.
		// 제네릭 클래스는 아래의 두가지 방법으로 인스턴스 할 수 있다.
		GnrClass<Integer> gc1 = new GnrClass<Integer>();
		GnrClass<Integer> gc2 = new GnrClass<>();
		
		gc1.setData(100);
		System.out.println(gc1.getData());
		
		gc2.setData(200);
		System.out.println(gc2.getData());
		
		System.out.println("======================================");
		// 2.Generic Method
		// : 클래스에 제네릭을 선언하지 않고 메소드에만 제네릭을 선언하는 방법.
		//   메소드의 매개변수 또는 리턴타입이 제네릭이라면 리턴타입 앞에도 제네릭을 선언해야 한다.
		System.out.println(GnrClass2.function("안녕"));
		System.out.println(GnrClass2.function(4));
		System.out.println(3.4f);
		System.out.println('a');
	}
}