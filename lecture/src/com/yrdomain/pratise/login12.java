package com.yrdomain.pratise;

import java.util.Scanner;

public class login12 {

	public static void main(String[] args) {
		String[] user = { "kyj" , "1234"};
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("[--------------------]");
			System.out.println(" [아이디를 입력하세요]" );
			String inputId = input.next();
			System.out.println(" [비밀번호를 입력하세요]" );
			String inputPw = input.next();
			
			if (inputId.equals(user[0]) && inputPw.equals(user[1])) {
			System.out.println(" [로그인에 성공하였습니다.] ");  break;}
			else { System.out.println("[아이디 또는 패스워드가 틀렸습니다. ");	
				}
			}
			input.close();
		}
}

