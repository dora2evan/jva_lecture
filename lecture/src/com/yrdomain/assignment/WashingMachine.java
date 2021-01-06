package com.yrdomain.assignment;
import com.yrdomain.assignment.*;

public class WashingMachine {	
	public int checkLaundry(int i) {
		if (i >=20) {
			System.out.println(" 세탁물의 양이 너무 많습니다. ");
			return 1;// 빨랫감의 양 적당
			
		} else if(i > )	
			System.out.println(" 세탁물의 양이 너무 많습니다.");				// 빨랫감의 양 오버
		return 1;
	}

//-----------------------------------------------------------------------	
	public int SpinSpeed(int i) { 										//통 속도 설정
		if (i == 10) {
			System.out.println(" 탈수 속도 : 약으로 설정합니다. ");
		} else if (i == 20) {
			System.out.println(" 탈수 속도 : 중으로 설정합니다. ");
		} else if (i == 30) {
			System.out.println(" 탈수 속도 : 강으로 설정합니다. ");
		} else {
			///////////////////////////////////////
		}
		 	System.out.println(); 
		 	System.out.println(" 탈수를 시작합니다. ");
		return i;
	}

//-----------------------------------------------------------------------
	public String SelectMode(int i) {
		String powerDry = "강력건조"; 										// 모드 종류
		String normalDry = "표준건조";
		String normalWash = "표준세탁";
		String babyWash = "유아용세탁";
		String spinDry = "행굼탈수";

		System.out.println(" 모드를 선택해주십시오."); 						// 모드 선택 출력
		System.out.println("[-------------------------------------]");
		System.out.println(" 1.강력건조 2. 표준건조 3. 표준세탁 4. 행굼탈수");
		System.out.println("[-------------------------------------]");
		System.out.println();

		if (i == 1) {
			System.out.println("[" + powerDry + " 선택]");
		} else if (i == 2) {
			System.out.println("[" + normalDry + " 선택]");
		} else if (i == 3) {
			System.out.println("[" + normalWash + " 선택]");
		} else if (i == 4) {
			System.out.println("[" + babyWash + " 선택]");
		} else if (i == 5) {
			System.out.println("[" + spinDry + " 선택]");
		} else {		
			/////////////////////////
		}

		return null;
	}
//---------------------------------------------------------------------메인

	public static void main(String[] args) {
		
		WashingMachine machine = new WashingMachine();

//		브랜드 이름으로 생성
//		machine.PowerOn();												// 전원 켜기
//		machine.SelectMode(2); 											// 세탁기 모드 고르기 /배열 처리
//		machine.isCheckLaundry(1); 										// 세탁물의 양 체크
//		양이 넘어가면 어떻게 할지 처리
		
		
//		machine.SpinSpeed(10);											// 탈수 속도 설정
//		machine.
//		machine.PowerOff(); 											// 전원 끄기
	}

}
