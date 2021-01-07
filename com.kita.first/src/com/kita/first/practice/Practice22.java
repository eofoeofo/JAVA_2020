package com.kita.first.practice;

public class Practice22 {
	public static void main(String[] args) {
		//  정수 배열 만들어서
		// 1~ 100까지 값을 각각 배열 안에 넣고
		// 배열 안에 든 값을 찍어보자.
		// 1, 2, 3, 4 ... , 100
		
		int[] arr1 = new int[100];
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = i+1;
			System.out.print(arr1[i] + " , ");
		}
	}
}
