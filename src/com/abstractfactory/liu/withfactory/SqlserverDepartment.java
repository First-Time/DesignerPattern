package com.abstractfactory.liu.withfactory;

public class SqlserverDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		// TODO Auto-generated method stub
		System.out.println("��SQL Server�и�Department����һ����¼");
	}

	@Override
	public Department getDepartment(int id) {
		// TODO Auto-generated method stub
		System.out.println("��SQL Server�и���id�õ�Department��һ����¼");
		return null;
	}

}
