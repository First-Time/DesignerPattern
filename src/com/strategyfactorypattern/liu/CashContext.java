package com.strategyfactorypattern.liu;

public class CashContext {

	private CashSuper cs = null;

	public CashContext(String type) {
		super();
		// TODO Auto-generated constructor stub
		switch (type) {
		case "�����շ�":
			cs = new CashNormal();
			break;
		case "�����":
			cs = new CashRebeat("0.8");
			break;
		case "��300��100":
			cs = new CashReturn("300", "100");
			break;

		default:
			break;
		}
	}

	public double getResult(double money) {
		return cs.acceptCash(money);
	}
}
