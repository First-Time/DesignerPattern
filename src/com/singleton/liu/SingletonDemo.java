package com.singleton.liu;

public class SingletonDemo {

	private SingletonDemo() {
	}

	private static class SingletonHolder {
		private static final SingletonDemo sInstance = new SingletonDemo();
	}

	public SingletonDemo getInstance() {
		return SingletonHolder.sInstance;
	}
}
