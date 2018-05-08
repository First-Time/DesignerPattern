package com.simplefactory.liu;

public class OperationStore {

	OperationFactory factory;

	public OperationStore(OperationFactory factory) {
		super();
		this.factory = factory;
	}

	public Operation initOperation(String operate) {
		Operation operation;
		operation = factory.createOperation(operate);
		operation.init();
		return operation;
	}
}
