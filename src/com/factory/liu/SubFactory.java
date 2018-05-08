package com.factory.liu;

public class SubFactory implements IFactory {

	@Override
	public Operation createOperation() {
		// TODO Auto-generated method stub
		return new OperationSub();
	}

}
