package com.strategypattern.liu;

public class CashRebeat extends CashSuper {

	private double moneyRepeat = 1d;
	
	public CashRebeat(String moneyRepeat) {
		super();
		this.moneyRepeat = Double.parseDouble(moneyRepeat);
	}

	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		return money * moneyRepeat;
	}

}
