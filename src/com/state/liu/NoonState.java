package com.state.liu;

import java.text.MessageFormat;

public class NoonState extends State {

	@Override
	public void handle(Work work) {
		// TODO Auto-generated method stub
		if (work.getHour() < 13) {
			System.out.println(MessageFormat.format("当前时间：{0}点  午饭：犯困，午休。",
					work.getHour()));
		}
		else {
			work.setState(new AfternoonState());
			work.writeProgram();
		}
	}

}
