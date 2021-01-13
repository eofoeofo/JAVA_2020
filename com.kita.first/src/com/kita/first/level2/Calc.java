package com.kita.first.level2;

public class Calc {
	
	public static void main(String[] args) {
		Calc myCalc1 = new Calc(); // 형식이 스캐너를 사용하는것과 비슷함
		Calc myCalc3 = new Calc(); // 같은 설계도의 다른 계산기
		Calc myCalc2 = new Calc(); // 새로운 Calc 객체가 생성되는 의미
		myCalc1.powerOn();
		myCalc1.powerOff();
		
		int num1 = sum(4,8);
		System.out.println(num1);
		
		int num2 = minus(5,4);
		System.out.println(num2);
		
		int num3 = multiply(5,4);
		System.out.println(num3);
		
		float num4 = divide(10,3);
		System.out.println("10 / 3 = " + num4);
	}
	
	// 메소드의 영역 
	// ---------------------
	// 		필드 (속성)
	static int n1 = 1; // 변하는 값
	// 		생성자
	
	// 		메소드 (행위, 만들 때 영어의 동사로 만듬)
	public void powerOn(/* 매개변수 */) {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() { // 접근 제한자(public)과 static을 쓰지않고도 가능
		System.out.println("전원을 끕니다.");
	}
	
	public static int sum(int n1, int n2) {
		int result = n1 + n2; // 39번째 라인과 40번째 라인의 타입이 서로 같아야한다 = int
		return result;
	}
	public static int minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	public static int multiply(int n1, int n2) {
		return n1 * n2; // 이것도 가능
	}
	public static float divide(float n1, float n2) {
		float result = n1 / n2;
		return result;
	}
	
	//Calc myCalc1 = new Calc();
	
	/* String str ="안녕"; */
	//힙 에는 str의 주소값이 저장
	//스택에는 안녕의 값이 저장
	//메소드에는 static이 저장
	
}
