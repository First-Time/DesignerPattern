package com.state.liu;

import java.text.MessageFormat;

public class EveningState extends State {

	@Override
	public void handle(Work work) {
		// TODO Auto-generated method stub
		if (work.isTaskFinish()) {
			work.setState(new RestState());
			work.writeProgram();
		} else {
			if (work.getHour() < 21) {
				System.out.println(MessageFormat.format("当前时间：{0}点  加班哦，疲惫之极。",
						work.getHour()));
			}
			else {
				work.setState(new SleepingState());
				work.writeProgram();
			}
		}
	}

}
