package com.state.liu;

import java.text.MessageFormat;

public class ForenoonState extends State {

	@Override
	public void handle(Work work) {
		// TODO Auto-generated method stub
		if (work.getHour() < 12) {
			System.out.println(MessageFormat.format("当前时间：{0}点  上午工作，精神百倍",
					work.getHour()));
		}
		else {
			work.setState(new NoonState());
			work.writeProgram();
		}
	}

}
