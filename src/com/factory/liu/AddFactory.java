package com.factory.liu;

public class AddFactory implements IFactory {

	@Override
	public Operation createOperation() {
		// TODO Auto-generated method stub
		return new OperationAdd();
	}

}
