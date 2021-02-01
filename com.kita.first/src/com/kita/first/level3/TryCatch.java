package com.kita.first.level3;

public class TryCatch {
	public static void main(String[] args) {
//		String str = "123.45";
//		int num1;
//		try {
//			num1 = Integer.parseInt(str);
//		} catch(Exception e) {
//			e.printStackTrace();
//			Double.parseDouble(str);
//		}
//		int n = Integer.parseInt(str); // 문자열을 정수로 변환하는 법. (int)str;은 안된다.
//		double num2 = Double.parseDouble(str); // 실수를 정수로 변환하는 법.
		double n1 = 3.4;
		int n2 = (int)n1;
		System.out.println(1 + 2 + 3);
		System.out.println(1 + 2 + "3");
		
////		Animal animal = new Animal();
//		Cat cat = new Cat();
//		animal = cat;
//		
//		try {
//			Dog dog = (Dog)animal;
//		} catch(Exception e) {
//			e.printStackTrace(); 
//			System.out.println("문제 발생 했습니다.");
//		} finally { 
//			System.out.println("형변환 시도 종료");
//		}
		
		// 예외처리 기본형
		try {
			
		} catch(Exception e) {
			e.printStackTrace(); // 필수는 아니지만 에러가 났을 때 콘솔창에 에러를 띄워주는 옵션
		} finally { // <- if의 else 같은 필수 아닌 옵션 
			
		}
	}
}
