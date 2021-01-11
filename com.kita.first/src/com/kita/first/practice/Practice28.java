package com.kita.first.practice;

public class Practice28 {
	public static void main(String[] args) {
		// 영어합계 : ?, 평균: ? 00.0
		// 수학합계 : ?, 평균: ? 00.0
		// 국어합계 : ?, 평균: ? 00.0
		// 전체합계 : ?, 평균: ? 00.0
		int[][] arr = {
				{90, 100, 88},  // 국
				{34, 99, 45},   // 영
				{89, 65, 74}    // 수
		};
		String[] clsArr = {"국어","영어","수학"};
		int[] sumArr = new int[clsArr.length]; // {0, 0, 0}
		int c;
		int n = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sumArr[i] += arr[i][j];
			}
		}
		
		/*
		 * for(int i=0; i<arr.length; i++) { for(int j=0; j<arr[i].length; j++) { } }
		 */ 
		for(int i=0; i<clsArr.length; i++) {
			System.out.printf("%s 합계 = %d 평균 = %.1f\n", clsArr[i],sumArr[i],(double)sumArr[i] / arr[i].length);
			for(int j=0; j<clsArr.length; j++) {
			}
		}
	}
}
