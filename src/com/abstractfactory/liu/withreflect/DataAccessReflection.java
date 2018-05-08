package com.abstractfactory.liu.withreflect;

public class DataAccessReflection {

	private static final String assembly = "com.abstractfactory.liu.withreflect";
	private static final String className = "Sqlserver";

	// private final String className = "Access";

	public static IUser createUser() {

		IUser iUser = null;

		try {
			Class<?> class1 = Class
					.forName(assembly + "." + className + "User");
			iUser = (IUser) class1.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return iUser;
	}

	public static IDepartment createDepartment() {
		IDepartment id = null;
		try {
			Class<?> class1 = Class.forName(assembly + "." + className
					+ "Department");
			id = (IDepartment) class1.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;
	}
}
