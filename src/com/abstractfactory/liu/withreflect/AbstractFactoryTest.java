package com.abstractfactory.liu.withreflect;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User();
		Department department = new Department();

		IUser iUser = DataAccessReflection.createUser();
		IDepartment iDepartment = DataAccessReflection.createDepartment();

		iUser.insert(user);
		iUser.getUser(1);

		iDepartment.insert(department);
		iDepartment.getDepartment(1);
	}

}
