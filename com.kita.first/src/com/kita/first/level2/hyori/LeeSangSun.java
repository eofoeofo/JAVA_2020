package com.kita.first.level2.hyori;

public class LeeSangSun extends LeeHyoRi {
	LeeSangSun(){
		super("인스타"); // 부모클래스를 가르키는 객체(부모생성자를 가르킴)
		this.sns = ""; 
	}
	
	public static void main(String[] args) {
		LeeHyoRi hr = new LeeHyoRi();
		hr.music = "유고걸"; // 자신의 클래스 내부에서 접근이 가능하다
		hr.sns = "인스타"; // 자신의 클래스 내부에서 접근이 가능하다
//		hr.star = 1000000; // 자신의 클래스 내부에서만 접근이 가능하다
	
	LeeHyoRi hr2 = new LeeHyoRi("인스타");
//	LeeHyoRi hr3 = new LeeHyoRi(1000000);
	
	hr.sing();
	hr.drinkTea();
//	hr.dance();
	}
}
