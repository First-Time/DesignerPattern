package com.abstractfactory.liu.withreflectandpro;

public class AccessUser implements IUser {

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("��Access�и�User����һ����¼");
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("��Access�и���id�õ�User��һ����¼");
		return null;
	}

}
