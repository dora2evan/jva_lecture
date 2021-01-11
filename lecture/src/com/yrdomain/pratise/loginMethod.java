package com.yrdomain.pratise;

public class loginMethod {				
	
	public static void main(String[] args) {
		loginMethod login = new loginMethod();
		
		login.compareId("kyj", "1234");
																	
		login.say();
		
	
	
	   
	}							
// -----------------------------------------------------------------------------------------------------	
	static String[] user = {"kyj" , "1234"};		    //변수 선언
	
	public void compareId(String id , String pw) {
		if(id.equals(user[0]) && pw.equals(user[1])) {  //배열값과 입력 받은 데이터 비교
			System.out.println("[로그인 성공]");
		} else {
			System.out.println("[로그인 실패]");
			System.out.println("아이디와 패스워드를 다시 입력해주세요.");	}	
		}
	
	void say() {
				System.out.println("\n[오늘따라 삼겹살이 먹고 싶다.]");	
	}
	
	
//		String id = JOptionPane.showInputDialog("Enter a ID");
//		String pw = JOptionPane.showInputDialog("Enter a PW");

	
}	
	
//--------------------------------------------------------------------------------------------------------
	
	
			
	
	
	

//판단	

// 함수화
// input : id, pw
// output : message 1/0
	
//	public static  String urId() { 
//		return user[0];
//	}
//	public static String urPw() {
//		return user[1];
//	}
//	public static String Scanner() {
//		Scanner input = new Scanner(System.in);
		
//		return input.next();
//	}
	
		
//		System.out.println("-----------------------------------------");
//		
//		loginFx.urId();
//		System.out.println("아이디를 입력하십시오.");
//		loginFx.Scanner();
//		loginFx.urPw();
//		System.out.println("비밀번호를 입력하십시오.");
//		loginFx.Scanner();
//		
//		if(user[0].equals(Scanner()) && user[1].equals(Scanner())) {
//			System.out.println("로그인 되었습니다."); 
//			 }
//		else  { System.out.println("로그인 실패 다시 입력해주세요.");
//		
//			
//		}
	
//	}
//}
	
	






	
