package com.kita.first.level2;
	// 한 소스코드 내에는 하나의 클래스만 만드는게 좋다.
	public class Phone {/* extends Object */ // 원래는 생략 되어있지만 ,모든 객체는 최상위 클래스의 object를 상속 받는 개념이다.
		// Object(상속)->Phone(상속)->GalaxyPhone(상속)
	// public(접근제한자)가 붙을 수 있는 조건은 파일명과 같은 클래스만 붙을 수 있다.
	// 만약 클래스가 2개라면 컴파일러가 2개를 나누어서 클래스 파일로 저장을한다. (그래서 굳이 한 소스코드내에 두개의 클래스를 만들지 않는다.)
	// ------------------------------ 클래스(설계도면) ------------------------------
	
	// 필드(=변수랑 비슷)(속성)
	String company;
	String name;
	String color;
	int memory;
	
	// 생성자(필드를 초기화 하는) // 오버로딩 가능, (같은 생성자 이름의 매개변수의 길이,타입이 다르면 가능)
	// 인스턴스에 오류가 있으면 생성이 안됨
	// 생성자는 리턴타입이 존재하지 않는다.
	Phone() { // Ob
//		super(); // 내 부모의 생성자를 불러오는 기능 기본생성자는 super();가 생략되어있다 // super(); 는 Phone 클래스의 한 단계 위인 부모 클래스를 가르키는 기능
	} // 기본 생성자. (사용자가 아무것도 만들지 않았을 땐 컴파일러가 기본생성자를 자동 생성해줌) 
	
	// 17~20라인 처럼 this()로 받지 않는 생성자가 하나는 존재 해야한다.
	Phone(String company, String name, String color, int memory) { // 필드를 초기화 시켜주는 역할 // 변수의 이름을 정할땐 의미가 있게 짓자.
		this.company = company;
		this.name = name; // this. 을 써주지 않으면 Phone 매개변수의 name으로 인식을 한다. this는 내가 속해있는 객체를 가르킴
		this.color = color; // 자주색 = 예약어 // 문자열,필드 = 파란색 // 변수 = 갈색
		this.memory = memory;
	}
	
	// 오버로딩 가능, (같은 생성자 이름의 매개변수의 길이,타입이 다르면 가능)
	Phone(String company, String name, String color){
		this(company,name,color,200);
	}
	// 오버로딩 가능, (같은 생성자 이름의 매개변수의 길이,타입이 다르면 가능)
	Phone(String company,String name){
		this(company,name,"블랙",200); // this()는 생성자의 첫번 째 라인에서만 선언이 가능하다
	}
	
	// 메소드
//	(리턴타입 or void) 메소드명(매개변수 선언) {
//		실행식
//	리턴 타입
//	}
	// 메소드(동작)
	// void return X
	// 
	String sendMsg(String str) {
		String result = str;
		String blank = "";
		if("".equals(str)) {
			result = blank;
		}
		System.out.println(result);
		return result;
	}
	void call() {
		
	}
	void touch() {
		
	}
}
