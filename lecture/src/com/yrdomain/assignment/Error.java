package com.yrdomain.assignment;

public class Error {
	public int error1;
	public int minute;
	public int errorSound;
	public boolean isErrorAlarm = false;

	public boolean isErrorAlarm(int error1) {
		if (error1 == 1) {
			System.out.println(" 오류 발생! ");
			return false;
		} else {
			System.out.println(" 적당합니다!  ");
			return true;
		}
	}

}
