package com.statepattern.liu.basiccode;

public class Context {

	private State state;

	public Context(State state) {
		super();
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
		System.out.println("µ±Ç°×´Ì¬£º" + state.getClass().getSimpleName());
	}

	public void request() {
		state.handle(this);
	}
}
