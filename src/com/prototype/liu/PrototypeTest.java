package com.prototype.liu;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Resume resume = new Resume("大鸟");
        resume.SetPersonalInfo("男", "28");
        resume.SetWorkExperience("2014-2016", "XX公司");
        Resume resume2 = (Resume) resume.clone();
        resume2.SetWorkExperience("2015-2017", "YY公司");
        Resume resume3 = (Resume)resume.clone();
        resume3.SetWorkExperience("2016-2018", "ZZ公司");
        resume.Display();
        resume2.Display();
        resume3.Display();
	}

}
