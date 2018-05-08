package com.strategypattern.liu;

public class CashContext {

	private CashSuper cs = null;

	public CashContext(CashSuper cashSuper) {
		super();
		// TODO Auto-generated constructor stub
		cs = cashSuper;
	}

	public double getResult(double money) {
		return cs.acceptCash(money);
	}
}
