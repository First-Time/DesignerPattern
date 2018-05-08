package com.builder.liu;

public class PersonDirector {

	private PersonBuilder personBuilder;

	public PersonDirector(PersonBuilder personBuilder) {
		super();
		this.personBuilder = personBuilder;
	}

	public void createPerson() {
		personBuilder.buildHead();
		personBuilder.buildBody();
		personBuilder.buildArmLeft();
		personBuilder.buildArmRight();
		personBuilder.buildLegLeft();
		personBuilder.buildLegRight();
	}
}
