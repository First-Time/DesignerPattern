package com.memento.liu;

public class MementoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator originator = new Originator();
		originator.setState("On");
		originator.show();

		CareTaker careTaker = new CareTaker();
		careTaker.setMemento(originator.createMemento());

		originator.setState("Off");
		originator.show();

		originator.setMemento(careTaker.getMemento());
		originator.show();
	}

}
