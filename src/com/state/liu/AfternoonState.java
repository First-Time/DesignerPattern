package com.state.liu;

import java.text.MessageFormat;

public class AfternoonState extends State {

	@Override
	public void handle(Work work) {
		// TODO Auto-generated method stub
		if (work.getHour() < 17) {
			System.out.println(MessageFormat.format("当前时间：{0}点  下午状态还不错，继续努力。",
					work.getHour()));
		} else {
			work.setState(new EveningState());
			work.writeProgram();
		}
	}

}
