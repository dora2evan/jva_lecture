package com.yrdomain.pratise;

public class FindId {
	
	public static void main(String[] args) {
		String[] user = { "ho@naver.com" , "������" };   //�̸��� �־����
		String loginId = "evan000";
		String loginEmail = args[0];
		String loginName = args[1];
		loginId.substring(3);
		
		
		for (int i = 0; i <= user.length; i++ ) {
			} if (user[0].equals(loginEmail) && user[1].equals(loginName)) {
				System.out.println("-----------------------------");
				System.out.println("�̸����� ���������� �ԷµǾ����ϴ�. ");
				System.out.println("���̵�� " + "***" + loginId.substring(3) + " �Դϴ�. ");
				System.out.println("-------------------------------");
			} 	else {
				System.out.println("---------------------------------");
				System.out.println("����. �ٽ� �Է��� �ֽʽÿ�. ");
				System.out.println("---------------------------------");
				
			}

		
	}
}	
	






//�̸��� ���ǿ� �־����
//���������� �Է� �Ǿ����� ���� �����ֱ� �ƴϸ� ���� �޼��� �����ֱ�