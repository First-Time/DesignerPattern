package com.state.liu;

import java.text.MessageFormat;

public class NoonState extends State {

	@Override
	public void handle(Work work) {
		// TODO Auto-generated method stub
		if (work.getHour() < 13) {
			System.out.println(MessageFormat.format("��ǰʱ�䣺{0}��  �緹�����������ݡ�",
					work.getHour()));
		}
		else {
			work.setState(new AfternoonState());
			work.writeProgram();
		}
	}

}
