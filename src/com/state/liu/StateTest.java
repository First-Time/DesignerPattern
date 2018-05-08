package com.state.liu;

public class StateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Work work = new Work();
		work.setState(new ForenoonState());
		work.setHour(8);
		work.writeProgram();
		work.setHour(9);
		work.writeProgram();
		work.setHour(10);
		work.writeProgram();
		work.setHour(12);
		work.writeProgram();
		work.setHour(12.5);
		work.writeProgram();
		work.setHour(13);
		work.writeProgram();
		work.setHour(15);
		work.writeProgram();

		work.setTaskFinish(true);
		work.setTaskFinish(false);
		work.setHour(17);
		work.writeProgram();
		work.setHour(19);
		work.writeProgram();
		work.setHour(21);
		work.writeProgram();
		work.setHour(22);
		work.writeProgram();
	}

}
