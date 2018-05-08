package com.state.liu;

public class Work {

	private State state;
	private double hour;
	private boolean taskFinish;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	public boolean isTaskFinish() {
		return taskFinish;
	}

	public void setTaskFinish(boolean taskFinish) {
		this.taskFinish = taskFinish;
	}

	public void writeProgram() {
		state.handle(this);
	}
}
