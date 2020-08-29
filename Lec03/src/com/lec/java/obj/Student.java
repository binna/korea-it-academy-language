package com.lec.java.obj;

public class Student {
	
	int num;
	String name;
	
	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
	// equals(), hashCode() ¿Á¡§¿«
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student) obj;
			if(this.num == std.num) {
				return true;
			}
			return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.num;
	}

} // end class