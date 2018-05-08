package com.observer.liu;

import java.util.Observable;
import java.util.Observer;

public class Coder implements Observer {

	public String name;

	public Coder(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable observable, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("Hi, " + name + ", DevTechFrontier更新啦，内容：" + arg);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "码农" + name;
	}
}
