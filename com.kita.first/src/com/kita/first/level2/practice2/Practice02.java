package com.kita.first.level2.practice2;

public class Practice02 {
	public static void main(String[] args) {
		int n1 = sum(5,6);
		System.out.println(n1);
		
		int n2 = minus(4,7);
		System.out.println(n2);
		
		int n3 = multeply(n1,n2);
		System.out.println(n3);
		
		double n4 = divide(5,3);
		System.out.println(n4);
		
		int n5 = sum(5,6,7);
	}
	public static int sum(int n1,int n2) {
		return n1 + n2;
	}
	public static int sum(int n1,int n2,int n3) { // 오버로딩(메소드 계속쌓기),(매개변수 타입,길이가 달라야함)
		return n1 + n2 + n3;
	}
	public static int minus(int n1,int n2) { // 39번째 라인과 40번째 라인의 타입이 서로 같아야한다 = int
		return n1 - n2;
	}
	public static int multeply(int n1,int n2) { // 39번째 라인과 40번째 라인의 타입이 서로 같아야한다 = int
		return n1 * n2;
	}
	public static double divide(int n1,int n2) { // 39번째 라인과 40번째 라인의 타입이 서로 같아야한다 = int
		return (double)n1 / n2;
	}
	
	// 크기 : 정수<실수<문자열
}
