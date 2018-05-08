package com.abstractfactory.liu.withfactory;

public class SqlserverDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		// TODO Auto-generated method stub
		System.out.println("在SQL Server中给Department增加一条记录");
	}

	@Override
	public Department getDepartment(int id) {
		// TODO Auto-generated method stub
		System.out.println("在SQL Server中根据id得到Department表一条记录");
		return null;
	}

}
