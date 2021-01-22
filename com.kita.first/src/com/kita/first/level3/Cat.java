package com.kita.first.level3;

public class Cat extends Animal {
	// Override로 재정의를 한다
	@Override
	void crying() {
		System.out.println("고양이가 야옹 운다");
	}
}
