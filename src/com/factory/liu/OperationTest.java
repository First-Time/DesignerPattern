package com.factory.liu;

public class OperationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFactory iFactory = new AddFactory();
		Operation oper;
		oper = iFactory.createOperation();
		oper.setNumberA(1);
		oper.setNumberB(2);
		double result = oper.getResult();
		System.out.println(result);
		
		iFactory = new SubFactory();
		oper = iFactory.createOperation();
		oper.setNumberA(1);
		oper.setNumberB(2);
		result = oper.getResult();
		System.out.println(result);
		
		iFactory = new MulFactory();
		oper = iFactory.createOperation();
		oper.setNumberA(1);
		oper.setNumberB(2);
		result = oper.getResult();
		System.out.println(result);
		
		iFactory = new DivFactory();
		oper = iFactory.createOperation();
		oper.setNumberA(1);
		oper.setNumberB(2);
		result = oper.getResult();
		System.out.println(result);
	}
}
