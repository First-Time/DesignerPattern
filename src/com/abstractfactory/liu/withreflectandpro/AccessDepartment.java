package com.abstractfactory.liu.withreflectandpro;

public class AccessDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		// TODO Auto-generated method stub
		System.out.println("��Access�и�Department����һ����¼");
	}

	@Override
	public Department getDepartment(int id) {
		// TODO Auto-generated method stub
		System.out.println("��Access�и���id�õ�Department��һ����¼");
		return null;
	}

}
