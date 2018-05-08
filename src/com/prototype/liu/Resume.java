package com.prototype.liu;

import java.text.MessageFormat;

public class Resume implements Cloneable {

	private String name;
	private String sex;
	private String age;
	private WorkExperience workExperience;

	public Resume(String name) {
		super();
		this.name = name;
		workExperience = new WorkExperience();
	}

	private Resume(WorkExperience workExperience)
			throws CloneNotSupportedException {
		super();
		this.workExperience = (WorkExperience) workExperience.clone();
	}

	/**
	 * 设置个人信息
	 * 
	 * @param sex
	 * @param age
	 */
	public void SetPersonalInfo(String sex, String age) {
		this.sex = sex;
		this.age = age;
	}

	/**
	 * 设置工作经历
	 * 
	 * @param timeArea
	 * @param company
	 */
	public void SetWorkExperience(String timeArea, String company) {
		workExperience.setTimeArea(timeArea);
		workExperience.setCompany(company);
	}

	public void Display() {

		System.out.println(MessageFormat
				.format("{0}, {1}, {2}", name, sex, age));
		System.out.println(MessageFormat.format("工作经历{0}, {1}",
				workExperience.getTimeArea(), workExperience.getCompany()));
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Resume resume = new Resume(this.workExperience);
		resume.name = this.name;
		resume.age = this.age;
		resume.sex = this.sex;
		return resume;
	}
}
