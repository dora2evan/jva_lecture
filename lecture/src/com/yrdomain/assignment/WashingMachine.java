package com.yrdomain.assignment;
import com.yrdomain.assignment.*;

public class WashingMachine {	
	public int checkLaundry(int i) {
		if (i >=20) {
			System.out.println(" ��Ź���� ���� �ʹ� �����ϴ�. ");
			return 1;// �������� �� ����
			
		} else if(i > )	
			System.out.println(" ��Ź���� ���� �ʹ� �����ϴ�.");				// �������� �� ����
		return 1;
	}

//-----------------------------------------------------------------------	
	public int SpinSpeed(int i) { 										//�� �ӵ� ����
		if (i == 10) {
			System.out.println(" Ż�� �ӵ� : ������ �����մϴ�. ");
		} else if (i == 20) {
			System.out.println(" Ż�� �ӵ� : ������ �����մϴ�. ");
		} else if (i == 30) {
			System.out.println(" Ż�� �ӵ� : ������ �����մϴ�. ");
		} else {
			///////////////////////////////////////
		}
		 	System.out.println(); 
		 	System.out.println(" Ż���� �����մϴ�. ");
		return i;
	}

//-----------------------------------------------------------------------
	public String SelectMode(int i) {
		String powerDry = "���°���"; 										// ��� ����
		String normalDry = "ǥ�ذ���";
		String normalWash = "ǥ�ؼ�Ź";
		String babyWash = "���ƿ뼼Ź";
		String spinDry = "���Ż��";

		System.out.println(" ��带 �������ֽʽÿ�."); 						// ��� ���� ���
		System.out.println("[-------------------------------------]");
		System.out.println(" 1.���°��� 2. ǥ�ذ��� 3. ǥ�ؼ�Ź 4. ���Ż��");
		System.out.println("[-------------------------------------]");
		System.out.println();

		if (i == 1) {
			System.out.println("[" + powerDry + " ����]");
		} else if (i == 2) {
			System.out.println("[" + normalDry + " ����]");
		} else if (i == 3) {
			System.out.println("[" + normalWash + " ����]");
		} else if (i == 4) {
			System.out.println("[" + babyWash + " ����]");
		} else if (i == 5) {
			System.out.println("[" + spinDry + " ����]");
		} else {		
			/////////////////////////
		}

		return null;
	}
//---------------------------------------------------------------------����

	public static void main(String[] args) {
		
		WashingMachine machine = new WashingMachine();

//		�귣�� �̸����� ����
//		machine.PowerOn();												// ���� �ѱ�
//		machine.SelectMode(2); 											// ��Ź�� ��� ���� /�迭 ó��
//		machine.isCheckLaundry(1); 										// ��Ź���� �� üũ
//		���� �Ѿ�� ��� ���� ó��
		
		
//		machine.SpinSpeed(10);											// Ż�� �ӵ� ����
//		machine.
//		machine.PowerOff(); 											// ���� ����
	}

}
