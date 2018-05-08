package com.decorate.liu;

public class Finery extends Person {

	protected Person component;

	public void decorate(Person component) {
		this.component = component;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		if (component != null) {
			component.show();
		}
	}
}
