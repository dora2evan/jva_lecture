package com.yrdomain.pratise;

public class Multi {

	public int[] random() {
		int[] ranNum = new int[2];
		for (int i = 0; i < 2; i++) {
			ranNum[i] = (int) (Math.random() * 8) + 2;				//2~9������ ������ ����
			for (int j = 1; j < i; j++) {
				if (i == j) {
					i--;
					break;
				}
			}
			System.out.println(ranNum[i]);
			System.out.println();
		}
		return ranNum;
			
	}
//---------------------------------------------------------------------------------------------------------
	public void Gugudan(int a , int b) {
		for (int i=0; i < 2; i++) {
			switch (i) {											//������ �ΰ��̹Ƿ� case 1�� default
			case 1:
				for( int j= 1; j < 10; j++) {
					System.out.println();
					System.out.print(b + "x" + j + "=" + b*j );
					
				}
				break;
			default:
				for(int j = 1; j<10; j++) {
					System.out.println(a + "x" + j + "=" + a*j);
				}
			}
			
		}
	}
		
//--------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {

		Multi multi = new Multi();
		int[] number = new int[2];
		number = multi.random();										//���� ���� 2�� ȣ��
		multi.Gugudan(number[0], number[1]);							// �������� 2������ ���� ������ ȣ��

	}
}
