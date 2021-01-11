package com.yrdomain.ch02;

public class variableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10;
		}
//		int v3 = v1 + v2 +5; 컴파일 에러가 발생
	}

}

