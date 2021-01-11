package com.yrdomain.pratise;

import java.util.Scanner;

public class AdvancedFindId {

	public static void main(String[] args) {
		String[] user = {"김유중" , "toast@com"};	
		String userId = "evan";
		Scanner input = new Scanner(System.in);
		
		while(true) {
				System.out.println("[---------------------------------------------]");
				System.out.println("[ 이름을 입력하세요.]");
				String userName = input.next();
				System.out.println("이메일을 입력하세요.");
				String userEmail = input.next();
				
				if (userName.equals(user[0]) && (userEmail.equals(user[1]))) {
							System.out.println("계정확인이 되었습니다."+ " 아이디는 " + ""+userId+"**" + "입니다."); break; 
							} else { System.out.println("이름 또는 이메일을 잘못 입력하셨습니다. "); 
						  System.out.println("[---------------------------------------------]");
						  System.out.println("[다시 입력해 주십시오.]");
				} 
	
		}
		input.close();
	} 
}
