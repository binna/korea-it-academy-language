package com.lec.java.practice.me;

public abstract class MarketAdapter implements Market {

	@Override
	public abstract String[] getMenu();

	@Override
	public void sell(String choice) {}
	
}