package com.simplefactory.liu;

public class OperationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OperationFactory factory = new OperationFactory();
		OperationStore store = new OperationStore(factory);
		Operation oper;
		oper = store.initOperation("+");
		oper.setNumberA(1);
		oper.setNumberB(2);
		double result = oper.getResult();
		System.out.println(result);
		oper = store.initOperation("-");
		oper.setNumberA(1);
		oper.setNumberB(2);
		result = oper.getResult();
		System.out.println(result);
		oper = store.initOperation("*");
		oper.setNumberA(1);
		oper.setNumberB(2);
		result = oper.getResult();
		System.out.println(result);
		oper = store.initOperation("/");
		oper.setNumberA(1);
		oper.setNumberB(0);
		result = oper.getResult();
		System.out.println(result);

		/*Operation oper;
		oper = OperationFactory.createOperation("+");
		oper.setNumberA(1);
		oper.setNumberB(2);
		double result = oper.getResult();
		System.out.println(result);
		oper = OperationFactory.createOperation("-");
		oper.setNumberA(1);
		oper.setNumberB(2);
		result = oper.getResult();
		System.out.println(result);
		oper = OperationFactory.createOperation("*");
		oper.setNumberA(1);
		oper.setNumberB(2);
		result = oper.getResult();
		System.out.println(result);
		oper = OperationFactory.createOperation("/");
		oper.setNumberA(1);
		oper.setNumberB(0);
		result = oper.getResult();
		System.out.println(result);*/
	}
}
