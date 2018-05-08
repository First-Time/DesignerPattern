package com.abstractfactory.liu.withreflectandpro;

public class AccessDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		// TODO Auto-generated method stub
		System.out.println("在Access中给Department增加一条记录");
	}

	@Override
	public Department getDepartment(int id) {
		// TODO Auto-generated method stub
		System.out.println("在Access中根据id得到Department表一条记录");
		return null;
	}

}
