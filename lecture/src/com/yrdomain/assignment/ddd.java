package com.yrdomain.assignment;

public class ddd {
//	Scanner sc = new Scanner(System.in);
//		int upbotton = 0;
//		int downbotton = 0;
//		boolean power = true;
//		String brand = "";
//		public void Heater () {							//���� ���̵�ƴ�
		}
		
//		public void Heater(int upbotton, int downbotton, boolean power, String brand) {   //���� ���̵� �ƴ�
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
//	String babyWash = "���ƿ뼼Ź";
//	String spinDry = "���Ż��";
	
//	void PowerOn() {
		System.out.println("[--------------------------------]");
		System.out.println(" �ȳ��ϼ���. LG ");
		System.out.println(" ����Ʈ �߽��� ��Ź���Դϴ�!");
		System.out.println("[--------------------------------]");
		System.out.println();
//		IsPowerOn = true;
	}

//	void PowerOff() { // ���� off
		System.out.println();
		System.out.println("[--------------------------------]");
		System.out.println(" �� �̿����ּ���.!");
		System.out.println("[--------------------------------]");
//		IsPowerOn = false;
	}

//	public WashingMachine() {
	}

//	public int checkLaundry(int i) {
		if (i >=20) {
			System.out.println(" ��Ź���� ���� �ʹ� �����ϴ�. ");
			return 1;// �������� �� ����
			
//		} else if(i > )	
			System.out.println(" ��Ź���� ���� �ʹ� �����ϴ�.");	
//		return 1;
	}
//-----------------------------------------------------------------------	
//	public int SpinSpeed(int speed) {										//����ġ ���̽� ��
		if (this.Speed == speed) {		
			System.out.println(" Ż�� �ӵ� : ������ �����մϴ�. ");
//		} else if (i == 20) {
			System.out.println(" Ż�� �ӵ� : ������ �����մϴ�. ");
//		} else if (i == 30) {
			System.out.println(" Ż�� �ӵ� : ������ �����մϴ�. ");
			this.Speed = 30;
		} else {
			///////////////////////////////////////
		}
		System.out.println();
		System.out.println(" Ż���� �����մϴ�. ");
//		return i;
	}
}
if (i == 1) { // ����ġ, ���̽�
	selectmodestr = "[" + powerDry + " ����]";
} else if (i == 2) {
	selectmodestr = "[" + powerDry + " ����]";
} else if (i == 3) {
	selectmodestr = "[" + powerDry + " ����]";
} else if (i == 4) {
	selectmodestr = "[" + powerDry + " ����]";
} else if (i == 5) {
	selectmodestr = "[" + powerDry + " ����]";
} else {
	/////////////////////////
} // �� ����ġ�� ���ǿ� �´� case���� �����ϱ� ������ �ѹ��� Ž���� ������ �ȴ�.
	// default

return selectmodestr;
	
	
	
//-----------------------------------------------------------------------
//	public String SelectMode(int i) {		//�迭�� �ϰų� enumó��
//		String selectmodestr = "";
//		String normalDry = "ǥ�ذ���";
//		String normalWash = "ǥ�ؼ�Ź";
//		String babyWash = "���ƿ뼼Ź";
//		String spinDry = "���Ż��";

		System.out.println(" ��带 �������ֽʽÿ�."); // ��� ���� ���
		System.out.println("[-------------------------------------]");
		System.out.println(" 1.���°��� 2. ǥ�ذ��� 3. ǥ�ؼ�Ź 4. ���Ż��");
		System.out.println("[-------------------------------------]");
		System.out.println();
//		��, �ӵ�, ���� �ִ� ����

		if (i == 1) {										//����ġ, ���̽�
//			selectmodestr = "[" + powerDry + " ����]";
		} else if (i == 2) {
//			selectmodestr = "[" + powerDry + " ����]";
		} else if (i == 3) {
//			selectmodestr = "[" + powerDry + " ����]";
		} else if (i == 4) {
//			selectmodestr = "[" + powerDry + " ����]";
		} else if (i == 5) {
//			selectmodestr = "[" + powerDry + " ����]";
		} else {
			/////////////////////////
		}				//�� ����ġ�� ���ǿ� �´� case���� �����ϱ� ������ �ѹ��� Ž���� ������ �ȴ�.
						//default 

		return selectmodestr;
	}
//---------------------------------------------------------------------����
	public static void main(String[] args) {

		WashingMachine machine = new WashingMachine();
		machine.IsPowerOn = true;
		machine.Speed = 0;
		
//		�귣�� �̸����� ����
		machine.PowerOn();												// ���� �ѱ�
		machine.SelectMode(2); 											// ��Ź�� ��� ���� /�迭 ó��
		machine.isCheckLaundry(1); 										// ��Ź���� �� üũ
		���� �Ѿ�� ��� ���� ó��
		machine.SpinSpeed(10);											// Ż�� �ӵ� ����
		machine.PowerOff(); 											// ���� ����
	}
}