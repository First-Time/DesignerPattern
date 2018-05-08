package com.abstractfactory.liu.withreflect;

public class SqlserverUser implements IUser {

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("在SQL Server中给User增加一条记录");
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("在SQL Server中根据id得到User表一条记录");
		return null;
	}

}
