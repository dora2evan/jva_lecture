package com.yrdomain.pratise;

import java.util.Scanner;

public class login12 {

	public static void main(String[] args) {
		String[] user = { "kyj" , "1234"};
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("[--------------------]");
			System.out.println(" [���̵� �Է��ϼ���]" );
			String inputId = input.next();
			System.out.println(" [��й�ȣ�� �Է��ϼ���]" );
			String inputPw = input.next();
			
			if (inputId.equals(user[0]) && inputPw.equals(user[1])) {
			System.out.println(" [�α��ο� �����Ͽ����ϴ�.] ");  break;}
			else { System.out.println("[���̵� �Ǵ� �н����尡 Ʋ�Ƚ��ϴ�. ");	
				}
			}
			input.close();
		}
}

