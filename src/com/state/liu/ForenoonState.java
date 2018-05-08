package com.state.liu;

import java.text.MessageFormat;

public class ForenoonState extends State {

	@Override
	public void handle(Work work) {
		// TODO Auto-generated method stub
		if (work.getHour() < 12) {
			System.out.println(MessageFormat.format("��ǰʱ�䣺{0}��  ���繤��������ٱ�",
					work.getHour()));
		}
		else {
			work.setState(new NoonState());
			work.writeProgram();
		}
	}

}
