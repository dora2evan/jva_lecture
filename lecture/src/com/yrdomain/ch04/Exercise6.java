package com.yrdomain.ch04;

public class Exercise6 {

	public static void main(String[] args) {
		for (int i = 1; i<=5; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			if(i==j) {
				System.out.println();
				}
			}
			
		}
	}

}
