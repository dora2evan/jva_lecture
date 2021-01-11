package com.yrdomain.assignment;

public class ddd {
//	Scanner sc = new Scanner(System.in);
//		int upbotton = 0;
//		int downbotton = 0;
//		boolean power = true;
//		String brand = "";
//		public void Heater () {							//원래 보이드아님
		}
		
//		public void Heater(int upbotton, int downbotton, boolean power, String brand) {   //원래 보이드 아님
			this.upbotton = upbotton;
			this.downbotton = downbotton;
			this.power = power;
			this.brand = brand;
		}
}
package com.yrdomain.assignment;

import com.yrdomain.assignment.*;

//public class WashingMachine {

//	public boolean IsPowerOn;
//	/public String selectmodestr;
//	public int Speed;
	
//	String normalDry;
//	String normalWash;
//	String babyWash = "유아용세탁";
//	String spinDry = "행굼탈수";
	
//	void PowerOn() {
		System.out.println("[--------------------------------]");
		System.out.println(" 안녕하세요. LG ");
		System.out.println(" 스마트 쌩쌩이 세탁기입니다!");
		System.out.println("[--------------------------------]");
		System.out.println();
//		IsPowerOn = true;
	}

//	void PowerOff() { // 전원 off
		System.out.println();
		System.out.println("[--------------------------------]");
		System.out.println(" 또 이용해주세요.!");
		System.out.println("[--------------------------------]");
//		IsPowerOn = false;
	}

//	public WashingMachine() {
	}

//	public int checkLaundry(int i) {
		if (i >=20) {
			System.out.println(" 세탁물의 양이 너무 많습니다. ");
			return 1;// 빨랫감의 양 적당
			
//		} else if(i > )	
			System.out.println(" 세탁물의 양이 너무 많습니다.");	
//		return 1;
	}
//-----------------------------------------------------------------------	
//	public int SpinSpeed(int speed) {										//스위치 케이스 문
		if (this.Speed == speed) {		
			System.out.println(" 탈수 속도 : 약으로 설정합니다. ");
//		} else if (i == 20) {
			System.out.println(" 탈수 속도 : 중으로 설정합니다. ");
//		} else if (i == 30) {
			System.out.println(" 탈수 속도 : 강으로 설정합니다. ");
			this.Speed = 30;
		} else {
			///////////////////////////////////////
		}
		System.out.println();
		System.out.println(" 탈수를 시작합니다. ");
//		return i;
	}
}
if (i == 1) { // 스위치, 케이스
	selectmodestr = "[" + powerDry + " 선택]";
} else if (i == 2) {
	selectmodestr = "[" + powerDry + " 선택]";
} else if (i == 3) {
	selectmodestr = "[" + powerDry + " 선택]";
} else if (i == 4) {
	selectmodestr = "[" + powerDry + " 선택]";
} else if (i == 5) {
	selectmodestr = "[" + powerDry + " 선택]";
} else {
	/////////////////////////
} // 각 스위치문 조건에 맞는 case문을 실행하기 때문에 한번의 탐색만 있으면 된다.
	// default

return selectmodestr;
	
	
	
//-----------------------------------------------------------------------
//	public String SelectMode(int i) {		//배열로 하거나 enum처리
//		String selectmodestr = "";
//		String normalDry = "표준건조";
//		String normalWash = "표준세탁";
//		String babyWash = "유아용세탁";
//		String spinDry = "행굼탈수";

		System.out.println(" 모드를 선택해주십시오."); // 모드 선택 출력
		System.out.println("[-------------------------------------]");
		System.out.println(" 1.강력건조 2. 표준건조 3. 표준세탁 4. 행굼탈수");
		System.out.println("[-------------------------------------]");
		System.out.println();
//		옷, 속도, 세제 넣는 과정

		if (i == 1) {										//스위치, 케이스
//			selectmodestr = "[" + powerDry + " 선택]";
		} else if (i == 2) {
//			selectmodestr = "[" + powerDry + " 선택]";
		} else if (i == 3) {
//			selectmodestr = "[" + powerDry + " 선택]";
		} else if (i == 4) {
//			selectmodestr = "[" + powerDry + " 선택]";
		} else if (i == 5) {
//			selectmodestr = "[" + powerDry + " 선택]";
		} else {
			/////////////////////////
		}				//각 스위치문 조건에 맞는 case문을 실행하기 때문에 한번의 탐색만 있으면 된다.
						//default 

		return selectmodestr;
	}
//---------------------------------------------------------------------메인
	public static void main(String[] args) {

		WashingMachine machine = new WashingMachine();
		machine.IsPowerOn = true;
		machine.Speed = 0;
		
//		브랜드 이름으로 생성
		machine.PowerOn();												// 전원 켜기
		machine.SelectMode(2); 											// 세탁기 모드 고르기 /배열 처리
		machine.isCheckLaundry(1); 										// 세탁물의 양 체크
		양이 넘어가면 어떻게 할지 처리
		machine.SpinSpeed(10);											// 탈수 속도 설정
		machine.PowerOff(); 											// 전원 끄기
	}
}