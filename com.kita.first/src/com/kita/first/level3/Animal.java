package com.kita.first.level3;

public abstract class Animal { // abstract 추상 클래스
	// abstract은 클래스와 메소드만 가능하다
	// 실체 없이 개념만 있는 존재
	// new 생성자로 객체를 찍어 낼 수 없고, 상속만 가능해진다.
	// 이유, 공통적인 필드, 메소드가 있을 때, 부모가 없을 경우 자식마다 만들어 줘야하지만, 
	// 상속을 받았을 때 , 
	// 필드
	String name = "동물";
	// 생성자
	Animal() {
		super(); // 부모객체를 지칭
	}
	// 메소드 , 상속 받아서 / abstract void crying (); 추상 메소드의 형식. 
	// 실제 메소드로 재정의 받아야만 한다. 무조건 사용해야할떄?
	// 매개변수를 하나도 받지 않곘다는 뜻
	// 반드시 Override를 시켜줘야 한다
	abstract void crying ();  // 추상클래스 안에서 private 못씀 public,protectd만 가능
		
//	void crying() {
//		System.out.println("동물이 운다");
//	}
}
