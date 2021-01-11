package com.yrdomain.assignment;

public class Alarm {
	public int hour;
	public int minute;
	public boolean active = false;
	
	public void SetTime(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	public boolean isActiveAlarm() {
		if(active==true) {
			System.out.println(" 알람이 설정되어있습니다. ");
			return true;
		} else {
			System.out.println(" 알람이 설정되어 있지 않습니다. ");
			System.out.println(" 알람을 설정하시겠습니까? ");
			return false;
		}
	}
	
}
