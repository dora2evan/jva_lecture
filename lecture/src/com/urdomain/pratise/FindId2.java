package com.urdomain.pratise;

import java.util.Scanner;

public class FindId2 {

	public static void main(String[] args) {
		String[] user = {"joy", "myid123", "e@mail.com"} ;   // db 사용자 입력값		
		Scanner scanner = new Scanner(System.in);
		
		
		String name = "joy";
		String id = "myid123";
		String mail = "e@mail.com";
		
		System.out.println("이름을 입력해주세요.");
		name = scanner.nextLine();
		System.out.println(name);
		
		System.out.println("이메일을 입력해주세요.");
		mail = scanner.nextLine();
		System.out.println(mail);
//--------------------------------------------------------------------------
		
		char[] idnew = new char[id.length()];

		for(int i=0;i<idnew.length;i++){ 
			idnew[i]=(id.charAt(i));
		}
		if(idnew.length>=1 & idnew.length<=3) {
			
		}else if(idnew.length>=4 & idnew.length<7){
			idnew[3]= '*';
			idnew[4]= '*';
		} else {
			idnew[3]= '*';
			idnew[4]= '*';
			idnew[5]= '*';
		}	
		String idnew2 = String.valueOf(idnew); 
		
//--------------------------------------------------------------------------		

		if( name.equals(user[0]) && mail.equals(user[2]) )  {
			System.out.println(name + "님의 아이디는 " +  idnew2 + " 입니다.");

		} else {
			System.out.println("입력하신 이름과 이메일이 일치하지 않습니다.");
		}
	}
}

