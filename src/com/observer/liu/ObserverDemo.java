package com.observer.liu;

public class ObserverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DevTechFrontier devTechFrontier = new DevTechFrontier();
		devTechFrontier.addObserver(new Coder("coder-1"));
		devTechFrontier.addObserver(new Coder("coder-2"));
		devTechFrontier.addObserver(new Coder("coder-3"));
		devTechFrontier.postNewPublication("¸üÐÂÀ²£¡");
	}

}
