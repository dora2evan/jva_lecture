package com.yrdomain.pratise;

public class loginMethod {				
	
	public static void main(String[] args) {
		loginMethod login = new loginMethod();
		
		login.compareId("kyj", "1234");
																	
		login.say();
		
	
	
	   
	}							
// -----------------------------------------------------------------------------------------------------	
	static String[] user = {"kyj" , "1234"};		    //���� ����
	
	public void compareId(String id , String pw) {
		if(id.equals(user[0]) && pw.equals(user[1])) {  //�迭���� �Է� ���� ������ ��
			System.out.println("[�α��� ����]");
		} else {
			System.out.println("[�α��� ����]");
			System.out.println("���̵�� �н����带 �ٽ� �Է����ּ���.");	}	
		}
	
	void say() {
				System.out.println("\n[���õ��� ������ �԰� �ʹ�.]");	
	}
	
	
//		String id = JOptionPane.showInputDialog("Enter a ID");
//		String pw = JOptionPane.showInputDialog("Enter a PW");

	
}	
	
//--------------------------------------------------------------------------------------------------------
	
	
			
	
	
	

//�Ǵ�	

// �Լ�ȭ
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
//		System.out.println("���̵� �Է��Ͻʽÿ�.");
//		loginFx.Scanner();
//		loginFx.urPw();
//		System.out.println("��й�ȣ�� �Է��Ͻʽÿ�.");
//		loginFx.Scanner();
//		
//		if(user[0].equals(Scanner()) && user[1].equals(Scanner())) {
//			System.out.println("�α��� �Ǿ����ϴ�."); 
//			 }
//		else  { System.out.println("�α��� ���� �ٽ� �Է����ּ���.");
//		
//			
//		}
	
//	}
//}
	
	






	
