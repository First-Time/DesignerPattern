package com.state.liu;

import java.text.MessageFormat;

public class RestState extends State {

	@Override
	public void handle(Work work) {
		// TODO Auto-generated method stub
		System.out.println(MessageFormat.format("��ǰʱ�䣺{0}��  �°�ؼ��ˡ�",
				work.getHour()));
	}

}
