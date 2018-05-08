package com.state.liu;

import java.text.MessageFormat;

public class AfternoonState extends State {

	@Override
	public void handle(Work work) {
		// TODO Auto-generated method stub
		if (work.getHour() < 17) {
			System.out.println(MessageFormat.format("��ǰʱ�䣺{0}��  ����״̬����������Ŭ����",
					work.getHour()));
		} else {
			work.setState(new EveningState());
			work.writeProgram();
		}
	}

}
