package com.kita.first.level2;

public class Car {
	private int speed;
	private String color;
	
	Car(int speed) {
		this.speed = speed; // this.가 없으면 가장 가까운 객체인 매개변수를 지정함
	}
	
	int getSpeed() {
		return speed;
	}
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
}
