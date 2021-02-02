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
		
		Math.random(); // 0 ~ 0.999999
		int max = 9;
		int min = 1;
		int num = (int)(Math.random() * (max - min + 1) + min);
		
		String.valueOf(num);// 숫자 값을 문자 값으로 변환
		char c = new Character('A');
		int num0 = new Integer("1000");
		double num2 = new Double("34.56787");
		
		int num3 = new Integer("010801");
		System.out.println("num3: " + num3);
		
		String ad = "010801 345678";
		Character c2 = ad.charAt(7);
		
		switch(c2) {
		case 1: case 3:
			System.out.println("남자입니다.");
		case 2: case 4:
			System.out.println("여자입니다.");
		}
		
		String str_ = "오늘은 날씨가 좋다.";
		Character v1 = str.charAt(4);
		System.out.println("v1: " + v1);
		
		int idx = str_.indexOf("날씨가");
		System.out.println("idx: " + idx);
		
		int len = str_.length();
		System.out.println("len: " + len);
		
		String str2 = str_.replace("날씨가", "기분이"); //
		System.out.println("str2 : " + str2);
		
//		String str3 = str_.substring(4); // 
//		System.out.println("str3 : " + str3);
//		
//		String str4 = str_.substring(4, 7);// 앞쪽엔 내가 시작할 인덱스, 뒷쪽엔 안나올? 인덱스까지
//		System.out.println("str4 : " + str4);
		
		String str5 = "HELLO I'M FINE THANK YOU AND YOU";
		String str6 = str5.toLowerCase();
		String str7 = str5.toUpperCase();
		System.out.println("str6 : " +str6); // 소문자
		System.out.println("str7 : " +str7); // 대문자
		
		String str8 = " 안녕 ";
		String str9 = str8.trim();
		System.out.println("str8 : " + str8); // 
		
		Math.random();// 0~0.99999999999
		double n1 = Math.abs(-3.4); // 절대값 변환
		System.out.println("n1 : " + n1);
		
		double n2 = Math.ceil(5.6); // 올림값 으로 변환
		System.out.println("n2 : " + n2);
		n2 = Math.ceil(-4.6);
		System.out.println("n2 : " + n2);
		
		double n3 = Math.floor(5.6); // 내림값 으로 변환
		System.out.println("n3 : " + n3);
		
		double n4 = Math.round(4.4); // 반올림값으로 변환
		System.out.println("n4 : " + n4);
		
	}
}
