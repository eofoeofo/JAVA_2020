package com.kita.first;

public class Variable1 {
	public static void main(String[] args) {
		char v1;
		v1 = 'A'; // 변수의 초기값
		
		byte v2 = (byte)128;// 강제형변환
		System.out.println(v2);
		short v3;
		int v4;
		long v5;
		
		float v6;
		double v7;
		
		boolean v8;
		v8 = true;
		v8 = false;
		
		
		int num1 = 5;
		System.out.println(num1);
		num1 = 8;
		System.out.println(num1);
		
		final int NUM2 = 6; // 상수형 final, 상수이름 대문자표기
		System.out.println(NUM2);
		//NUM2 = 7; // 값 변환이 안됨
		
		String v9 = "안녕하세요."; // 참조변수(레퍼런스)
		System.out.println(v9);
	}

}
