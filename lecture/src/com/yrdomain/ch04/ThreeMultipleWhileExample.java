package com.yrdomain.ch04;

public class ThreeMultipleWhileExample {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		while(i<100) {
			if (i%3 == 0) {
				sum += i;
			}
			
			i+=1;
			
		}
		System.out.println("3의 배수의 합은 : "  + sum);
	}

}

