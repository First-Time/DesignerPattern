package com.state.liu;

import java.text.MessageFormat;

public class RestState extends State {

	@Override
	public void handle(Work work) {
		// TODO Auto-generated method stub
		System.out.println(MessageFormat.format("当前时间：{0}点  下班回家了。",
				work.getHour()));
	}

}
