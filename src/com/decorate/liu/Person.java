package com.decorate.liu;

import java.text.MessageFormat;

public class Person {

	private String name;

	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}

	public void show() {
		System.out.println(MessageFormat.format("װ�ε�{0}", name));
	}
}
