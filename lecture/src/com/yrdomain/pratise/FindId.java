package com.yrdomain.pratise;

public class FindId {
	
	public static void main(String[] args) {
		String[] user = { "ho@naver.com" , "김유중" };   //이름도 넣어야함
		String loginId = "evan000";
		String loginEmail = args[0];
		String loginName = args[1];
		loginId.substring(3);
		
		
		for (int i = 0; i <= user.length; i++ ) {
			} if (user[0].equals(loginEmail) && user[1].equals(loginName)) {
				System.out.println("-----------------------------");
				System.out.println("이메일이 정상적으로 입력되었습니다. ");
				System.out.println("아이디는 " + "***" + loginId.substring(3) + " 입니다. ");
				System.out.println("-------------------------------");
			} 	else {
				System.out.println("---------------------------------");
				System.out.println("실패. 다시 입력해 주십시오. ");
				System.out.println("---------------------------------");
				
			}

		
	}
}	
	






//이름도 조건에 넣어야함
//정상적으로 입력 되었으면 계정 보여주기 아니면 실패 메세지 보여주기