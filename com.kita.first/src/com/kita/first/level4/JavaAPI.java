package com.kita.first.level4;

public class JavaAPI {
	public static void main(String[] args) {
		Parent p = new Parent();
		String str = "안녕"; 
		StringBuffer sb = new StringBuffer("안녕"); // 유사 문자열
		boolean result = (str.equals(sb)); // 유사 문자열을 비교했을 때  false를 띄운다
		boolean result2 = (str.contentEquals(sb)); // 마찬가지로 유사 문자열을 비교했을 때 true를 띄운다
		System.out.println(result);
		System.out.println(result2);
		System.out.println(p.toString()); // p의 주소 값
		
		// Object가 기본 제공으로 하는 것
		str = "12";
		Integer.parseInt(str); // 정수값으로 변환
		System.out.println(str);
		str = "2.3";
		Double.parseDouble(str);
		Float.parseFloat(str);
		System.out.println(str);// 실수값으로 변환
		
//		Math.random(); // 0 ~ 0.999999
//		int num = (int)Math.random(); // 무조건 0이 나온다
//		int num = (int)Math.random(); * (max - min + 1) + min); // 이렇게 써줘야 0이 나오지 않음
		
//		String.valueOf(num);// 숫자 값을 문자 값으로 변환
		
		
		
	}
}
