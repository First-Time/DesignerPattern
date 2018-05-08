package com.abstractfactory.liu.af;

public class SqlServerFactory implements IFactory {

	@Override
	public IUser createUser() {
		// TODO Auto-generated method stub
		return new SqlserverUser();
	}

	@Override
	public IDepartment createDepartment() {
		// TODO Auto-generated method stub
		return new SqlserverDepartment();
	}

}
