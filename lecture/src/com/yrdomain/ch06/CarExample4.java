package com.yrdomain.ch06;

public class CarExample4 {

	public static void main(String[] args) {
		Car5 myCar = new Car5();
		
		myCar.setSpeed(-50);
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
	
	}

}
