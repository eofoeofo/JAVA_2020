package com.kita.first.level3;

public abstract class Animal { // abstract 추상 클래스 
	// new 생성자로 객체를 찍어 낼 수 없고, 상속만 가능해진다.
	// 이유, 공통적인 필드, 메소드가 있을 때, 부모가 없을 경우 자식마다 만들어 줘야하지만, 
	// 상속을 받았을 때 , 
	Animal() {
		super(); // 부모객체를 지칭
	}
	
	void crying() {
		System.out.println("동물이 운다");
	}
}
