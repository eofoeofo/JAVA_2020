package com.kita.first;

public class Variable2 {
	public static void main(String[] args) {
		int num = 5_000_000;
		System.out.println(num);
		
		int n1 = 10;
		long n2 = 20;
		
		long result1 = n1 + n2; // 자료형이 다르지만 int 보다 long 타입의 크기가 크기 때문에 출력이 가능하다
		System.out.println(result1);
		int result2 = (int)(n1 + n2); // 강제 형 변환
		System.out.println(result2);
	}

}
