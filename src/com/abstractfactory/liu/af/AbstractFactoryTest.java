package com.abstractfactory.liu.af;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User();
		Department department = new Department();

		IFactory factory = new AccessFactory();

		IUser iUser = factory.createUser();
		IDepartment iDepartment = factory.createDepartment();

		iUser.insert(user);
		iUser.getUser(1);

		iDepartment.insert(department);
		iDepartment.getDepartment(1);
	}

}
