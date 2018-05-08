package com.statepattern.liu.basiccode;

public class ConcreteStateB extends State {

	@Override
	public void handle(Context context) {
		// TODO Auto-generated method stub
		context.setState(new ConcreteStateA());
	}

}
