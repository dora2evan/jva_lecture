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
			System.out.println(" �˶��� �����Ǿ��ֽ��ϴ�. ");
			return true;
		} else {
			System.out.println(" �˶��� �����Ǿ� ���� �ʽ��ϴ�. ");
			System.out.println(" �˶��� �����Ͻðڽ��ϱ�? ");
			return false;
		}
	}
	
}
