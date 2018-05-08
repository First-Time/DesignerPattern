package com.builder.liu.basiccode;

public class BuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Director director = new Director();
		Builder b1 = new ConcreteBuilder1();
		Builder b2 = new ConcreteBuilder2();
		director.construct(b1);
		Product product = b1.getResult();
		product.show();
		
		director.construct(b2);
		product = b2.getResult();
		product.show();
	}

}
