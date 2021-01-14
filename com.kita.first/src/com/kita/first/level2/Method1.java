package com.kita.first.level2;

public class Method1 {
	// 메소드의 기본형태
	//void 메소드명(매개변수) {
		
	//}
	
	//static 을 붙이면 메모리가 저장되는 
	
	//리턴타입 메소드명(매개변수....) {
	//	return 리턴타입 변수;
	//}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int n1 = sum(3,4);
		int n2 = sum(arr);
		System.out.println(n1);
		System.out.println(n2);
		int n3 = sum (1,4,2,6,8,445,41,2);
		System.out.println(n3);
	}
	
//	static int sum(int[] arr) {
//		int result=0;
//		for(int i=0; i<arr.length; i++) {
//			result += arr[i];
//		}
//		return result;
//	}
	
	static int sum(int... arr) {
		int result=0;
		for(int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
//	static int sum(int n1,int... arr) {
//		int result=0;
//		for(int i=0; i<arr.length; i++) {
//			result += arr[i];
//		}
//		return result;
//	}
//	
	static int sum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
}
