package com.abstractfactory.liu.withreflect;

public class SqlserverUser implements IUser {

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("��SQL Server�и�User����һ����¼");
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("��SQL Server�и���id�õ�User��һ����¼");
		return null;
	}

}
