package com.yrdomain.pratise;

public class PleaseLotto {

	public static void main(String[] args) {
			
		int[] lotto = new int[7]; 
		
				System.out.print("로또 번호는 :");
				for(int i=0; i<lotto.length; i++) {
					lotto[i]= (int)(Math.random()*45) + 1;
					for(int j = 0; j <i; j++) {
						if(i==j ) {
							i--;
							break;
						}	
					}
					 
					System.out.print("[  " + lotto[i] + "  ]");
				}
				System.out.println(" 입니다. ");
	}
}	
					
				
				
				
				
			
		
			
				
				
				
				
			
	
	
	
	


