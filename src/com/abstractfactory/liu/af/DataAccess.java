package com.abstractfactory.liu.af;

public class DataAccess {

	private final static String db = "Sqlserver";

	// private final String db = "Access";

	public static IUser createUser() {

		IUser iu = null;
		switch (db) {
		case "Sqlserver":
			iu = new SqlserverUser();
			break;
		case "Access":
			iu = new AccessUser();
			break;

		default:
			break;
		}
		return iu;
	}

	public static IDepartment createDepartment() {

		IDepartment id = null;
		switch (db) {
		case "Sqlserver":
			id = new SqlserverDepartment();
			break;
		case "Access":
			id = new AccessDepartment();
			break;

		default:
			break;
		}
		return id;
	}
}
