package com.kita.first.level2.mamamoo;

import com.kita.first.level2.hyori.LeeHyoRi;

public class Hwasa extends LeeHyoRi {
	public Hwasa() {
		super();// 부모클래스를 가르치는 객체 (super(); <-- 매개변수 없는 부모의 생성자를 뜻함) 
		// 부모가 default라면 super("")는 안됨 (부모의 default생성자는 String값 )
		this.sns = "";
		super.sns = "";  // 이건 안씀 부모의 sns를 가르키는 뜻인데 이렇다면 상속을 받은 이유가 없으므로 부모는 냅둔다
		
		drinkTea();
	}
	public static void main(String[] args) {
		LeeHyoRi hr = new LeeHyoRi();
		hr.music = "유고걸"; // 자신의 클래스 내부에서 접근이 가능하다 (public)
//		hr.sns = "인스타"; // 자신의 클래스 내부에서 접근이 가능하다 (default)
//		hr.star = 1000000; // 자신의 클래스 내부에서만 접근이 가능하다 (private)
		
//		LeeHyoRi hr2 = new LeeHyoRi("인스타"); // default인 hr2은 다른 클래스라서 오류
//		LeeHyoRi hr3 = new LeeHyoRi(1000000); // private는 자기 클래스에서만 접근이 가능하다
		hr.sing();
//		hr.drinkTea();
//		hr.dance();
	}
}
