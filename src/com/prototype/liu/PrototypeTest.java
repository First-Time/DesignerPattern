package com.prototype.liu;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Resume resume = new Resume("����");
        resume.SetPersonalInfo("��", "28");
        resume.SetWorkExperience("2014-2016", "XX��˾");
        Resume resume2 = (Resume) resume.clone();
        resume2.SetWorkExperience("2015-2017", "YY��˾");
        Resume resume3 = (Resume)resume.clone();
        resume3.SetWorkExperience("2016-2018", "ZZ��˾");
        resume.Display();
        resume2.Display();
        resume3.Display();
	}

}
