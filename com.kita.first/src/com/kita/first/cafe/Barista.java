package com.kita.first.cafe;

public class Barista {
	public Coffee makeCoffee(MenuItem mi) { // 실제 타입의 커피를 만들고 리턴 해주면 된다.
		Coffee coffee = new Coffee(mi); //
		return coffee;
	}
}
