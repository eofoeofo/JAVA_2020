package com.kita.first.level2.pack1;

// final은 클래스,메소드에도 붙을 수 있다

// class에서도 final이 붙으면 상속이 불가능하다(자식이 없다)
public class FinalStatic {
	final int N1;
	static final int N2 = 3; //
	int n3 = 1;
	
	FinalStatic(int n1) {
		this.N1 = n1;
		printNum(n1);
//		n3 = n2;
	}
	
	//메소드에 final을 붙이면 Override가 불가능하다
	static void printNum(int input) {
		System.out.println(input);
//		System.out.println(n3); // static이 없으면 인스턴스객체
		// 인스턴스 객체로 선언을 해줘야
//		call(); // 메소드 안에서 다른 메소드를 호출
	}
	// 클래스에 static이 안붙었다면 생성자 및 메소드에서도 
	
	void call() {
		System.out.println("안녕");
	}
	
	// static이 붙으면 이미 메모리에 값이 올라가게된다.
	// 
}
