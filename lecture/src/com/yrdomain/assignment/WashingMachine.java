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
	public void PowerOn() { // �Ŀ��� ������ �λ� ���
		System.out.println("[-----------" + "�ý��۽���" + "-----------]");
	}

	public void PowerOff() { // ���� off
		System.out.println(" �ý��� ����");
	}

//---------------------------------------------------------------------
	public void ModeArr() {
		String[] Modes;
		Modes = new String[] { "���°���", "ǥ�ذ���", "ǥ�ؼ�Ź", "���ƿ뼼Ź", "���Ż��" };

		System.out.println("��� ���� " + Arrays.toString(Modes));

	}

//---------------------------------------------------------------------
	public void ModeTest() { // ��, �ӵ�, ���� �ִ� ����
		int selectMode = 2;
		// �߰� �ؾ��Ұ� �� ��忡 � ����� ������
		switch (selectMode) {
		case 1:
			System.out.println("[ ���°���" + " ����]");
			if (selectMode == 1) {
				System.out.println("[ ���°��� �µ��� �����Ͻðڽ��ϱ�?]");
			}
			break;
		case 2:
			System.out.println("[ ǥ�ذ���" + " ����]" + "\n");
			if (selectMode == 2)
				System.out.println("[ ǥ�ذ��� �غ� �����մϴ�." + "\n");
			break;
		case 3:
			System.out.println("[ ǥ�ؼ�Ź" + " ����]");
			if (selectMode == 3)
				System.out.println("[ ǥ�ؼ�Ź ����. ��Ź�� �����մϴ�.");
			break;
		case 4:
			System.out.println("[ ���ƿ뼼Ź" + " ����]");
			if (selectMode == 4)
				System.out.println("[ ���ƿ뼼Ź. �� �µ��� �������ֽʽÿ�");
			break;
		case 5:
			System.out.println("[ ���Ż��" + " ����]");
			if (selectMode == 5)
				System.out.println("[ ���Ż��. �غ���");
			break;
		}

	}

//---------------------------------------------------------------------

	public int checkLaundry(int weight) {
//		Arrays.sort(weight);
		this.weight = weight;
		weight = 15;
		if (weight >= 15) { // ��Ź���� ���� 15Ű�� �̻��϶�
			System.out.println(Error);
		}

		return weight;
	}

//-----------------------------------------------------------------------	
	public int SpinSpeed(int speed) {
		if (this.speed == speed) {
			System.out.println(" Ż�� �ӵ� : ������ �����մϴ�. ");
		} else if (speed == 20) {
			System.out.println(" Ż�� �ӵ� : ������ �����մϴ�. ");
		} else if (speed == 30) {
			System.out.println(" Ż�� �ӵ� : ������ �����մϴ�. ");
			this.speed = 30;
		} else {
			///////////////////////////////////////
		}
		System.out.println();
		System.out.println(" Ż���� �����մϴ�. ");
		return speed;
	}
}
//-----------------------------------------------------------------------
