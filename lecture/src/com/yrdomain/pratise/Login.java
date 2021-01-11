package com.yrdomain.pratise;

public class Login {

	public static void main(String[] args) {
		String[] user = {"CodingBabo" , "1234" }; { 
		String loginId = "abcd";
		String loginPw = "1234";
			
			if( user[0] == loginId && user[1] == loginPw) {
				System.out.println("정상적으로 로그인 되었습니다.");
			} else {
				System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
				System.out.println("다시 입력해 주세요 찡긋.");
			
			}	
			
		}	
			
	}

}
