package com.lec.java.interfaceAdapter;

public class Pig extends AnimalAdapter{
	
	public static void main(String[] args) {
		System.out.println(new AnimalAdapter() {} instanceof Animal);
	} // end main()
	
	@Override
	public void eat(String feed) {
		// TODO Auto-generated method stub
	} // end eat()

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
	} // end sleep()

} // end class