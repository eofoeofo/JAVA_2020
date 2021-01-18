package com.kita.first.level2;

public class PhoneTest {
	public static void main(String[] args) {
		GalaxyPhone sNote20 = new GalaxyPhone("SNote20","파란색",300,"갤럭시1");
		System.out.println(sNote20.ai_secr);
		sNote20.sendMsg("안녕");
		System.out.println(sNote20.company);
		System.out.println(sNote20.name);
		System.out.println(sNote20.color);
		System.out.println(sNote20.memory);
//		Phone myPhone = new Phone("갤럭시 S21","블랙",200); // 소괄호 안에 생성자의 매개변수 값을 초기화 해줘야함
//		Phone yourPhone = new Phone("갤럭시 노트20","화이트",150);
//		System.out.println(myPhone.company);
//		System.out.println(myPhone.name);
//		System.out.println(myPhone.color);
//		System.out.println(myPhone.memory+"G");
//		System.out.println();
//		System.out.println("---------------------");
//		System.out.println();
//		System.out.println(yourPhone.name);
//		System.out.println(yourPhone.color);
//		System.out.println(yourPhone.memory+"G");
//		
//		Phone phone1 = new Phone(); // 매개변수를 빈값으로 뒀기에 매개변수가 빈값인 기본생성자를 호출
//		System.out.println(phone1.name); 
//		Phone phone2 = new Phone("갤럭시 A80"); // 매개변수 하나인 Phone의 28~30 라인을 호출( 서로 매개변수가 1개 라서 그렇다)
//		System.out.println(phone2.name);
//		System.out.println(phone2.color);
//		System.out.println(phone2.memory);
	}
}
