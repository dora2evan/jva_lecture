package com.yrdomain.pratise;

import java.util.Scanner;

public class AdvancedFindId {

	public static void main(String[] args) {
		String[] user = {"������" , "toast@com"};	
		String userId = "evan";
		Scanner input = new Scanner(System.in);
		
		while(true) {
				System.out.println("[---------------------------------------------]");
				System.out.println("[ �̸��� �Է��ϼ���.]");
				String userName = input.next();
				System.out.println("�̸����� �Է��ϼ���.");
				String userEmail = input.next();
				
				if (userName.equals(user[0]) && (userEmail.equals(user[1]))) {
							System.out.println("����Ȯ���� �Ǿ����ϴ�."+ " ���̵�� " + ""+userId+"**" + "�Դϴ�."); break; 
							} else { System.out.println("�̸� �Ǵ� �̸����� �߸� �Է��ϼ̽��ϴ�. "); 
						  System.out.println("[---------------------------------------------]");
						  System.out.println("[�ٽ� �Է��� �ֽʽÿ�.]");
				} 
	
		}
		input.close();
	} 
}
