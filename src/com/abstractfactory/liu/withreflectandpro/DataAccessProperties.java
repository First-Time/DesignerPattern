package com.abstractfactory.liu.withreflectandpro;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DataAccessProperties {
	private static final String assembly = "com.abstractfactory.liu.withreflectandpro";
	private static String className;

	static {
		try {
			Properties pro = new Properties();
			InputStream in = new DataAccessProperties().getClass()
					.getResourceAsStream("/database.properties");
			pro.load(in);
			in.close();
			className = pro.getProperty("database");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

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
