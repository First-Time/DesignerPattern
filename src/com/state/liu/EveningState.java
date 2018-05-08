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
				System.out.println(MessageFormat.format("��ǰʱ�䣺{0}��  �Ӱ�Ŷ��ƣ��֮����",
						work.getHour()));
			}
			else {
				work.setState(new SleepingState());
				work.writeProgram();
			}
		}
	}

}
