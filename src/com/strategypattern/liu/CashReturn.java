package com.strategypattern.liu;

public class CashReturn extends CashSuper {

	private double moneyCondition = 0.0;
	private double moneyReturn = 0.0;
	
	public CashReturn(String moneyCondition, String moneyReturn) {
		super();
		this.moneyCondition = Double.parseDouble(moneyCondition);
		this.moneyReturn = Double.parseDouble(moneyReturn);
	}

	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		return money - Math.floor(money / moneyCondition) * moneyReturn;
	}

}
