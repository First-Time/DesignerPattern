package com.builder.liu.basiccode;

public class Director {
	
	public void construct(Builder builder) {
		builder.buildPartA();
		builder.buildPartB();
	}
}
