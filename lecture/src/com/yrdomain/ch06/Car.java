package com.yrdomain.ch06;

public class Car {
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	Car() {
		
	}
	
	Car(String model) {
//      this.model = model;
//		this.color = "����";
//		this.maxSpeed = 250;
		this(model, "����" , 250);
	}
	
	Car(String model, String color) {
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = 250;
		this(model, color ,250);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
