package com.prototype.liu;

public class WorkExperience implements Cloneable {

	private String timeArea;
	private String company;

	public String getTimeArea() {
		return timeArea;
	}

	public void setTimeArea(String timeArea) {
		this.timeArea = timeArea;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
