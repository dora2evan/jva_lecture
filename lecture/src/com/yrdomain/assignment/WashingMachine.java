package com.yrdomain.assignment;

import java.util.Arrays;

public class WashingMachine {

	int power;
	public String PowerOn;
	public String PowerOff;
	public String brand;
	public String product;
	public String Error;
	public String selectmode;
	public int speed;
	public String powerDry;
	public String normalDry;
	public String normalWash;
	public String babyWash;
	public String spinDry;

	public int weight;
	public int Alarm;

//---------------------------------------------------------------------

//---------------------------------------------------------------------
	public void PowerOn() { // 파워가 들어오면 인삿말 출력
		System.out.println("[-----------" + "시스템시작" + "-----------]");
	}

	public void PowerOff() { // 전원 off
		System.out.println(" 시스템 종료");
	}

//---------------------------------------------------------------------
	public void ModeArr() {
		String[] Modes;
		Modes = new String[] { "강력건조", "표준건조", "표준세탁", "유아용세탁", "행굼탈수" };

		System.out.println("모드 종류 " + Arrays.toString(Modes));

	}

//---------------------------------------------------------------------
	public void ModeTest() { // 옷, 속도, 세제 넣는 과정
		int selectMode = 2;
		// 추가 해야할것 각 모드에 어떤 기능이 들어가는지
		switch (selectMode) {
		case 1:
			System.out.println("[ 강력건조" + " 선택]");
			if (selectMode == 1) {
				System.out.println("[ 강력건조 온도를 설정하시겠습니까?]");
			}
			break;
		case 2:
			System.out.println("[ 표준건조" + " 선택]" + "\n");
			if (selectMode == 2)
				System.out.println("[ 표준건조 준비를 시작합니다." + "\n");
			break;
		case 3:
			System.out.println("[ 표준세탁" + " 선택]");
			if (selectMode == 3)
				System.out.println("[ 표준세탁 설정. 세탁을 시작합니다.");
			break;
		case 4:
			System.out.println("[ 유아용세탁" + " 선택]");
			if (selectMode == 4)
				System.out.println("[ 유아용세탁. 물 온도를 설정해주십시오");
			break;
		case 5:
			System.out.println("[ 행굼탈수" + " 선택]");
			if (selectMode == 5)
				System.out.println("[ 행굼탈수. 준비중");
			break;
		}

	}

//---------------------------------------------------------------------

	public int checkLaundry(int weight) {
//		Arrays.sort(weight);
		this.weight = weight;
		weight = 15;
		if (weight >= 15) { // 세탁물의 양이 15키로 이상일때
			System.out.println(Error);
		}

		return weight;
	}

//-----------------------------------------------------------------------	
	public int SpinSpeed(int speed) {
		if (this.speed == speed) {
			System.out.println(" 탈수 속도 : 약으로 설정합니다. ");
		} else if (speed == 20) {
			System.out.println(" 탈수 속도 : 중으로 설정합니다. ");
		} else if (speed == 30) {
			System.out.println(" 탈수 속도 : 강으로 설정합니다. ");
			this.speed = 30;
		} else {
			///////////////////////////////////////
		}
		System.out.println();
		System.out.println(" 탈수를 시작합니다. ");
		return speed;
	}
}
//-----------------------------------------------------------------------
