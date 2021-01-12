package com.kita.first.practice;

import java.util.Scanner;

public class Practice29 {
	public static void main(String[] args) {
		// 숫자 야구 만들기
		// 숫자 야구 게임시작!
		// 값1: 1
		// 값2: 2
		// 값3: 3
		// S : 0 / B : 1 / O : 2
		// 값1: 4
		// 값2: 5
		// 값3: 6
		// S : 1 / B : 0 / O : 2
		// 값1: 4
		// 값2: 3
		// 값3: 9
		// End!
		Scanner sc = new Scanner(System.in);
		final int LEN = 3;
		int[] rArr  = new int[LEN]; // 컴퓨터가 뽑는 랜덤 3개
		int[] myArr = new int[LEN];
		int strike=0;
		int ball=0;
		System.out.println(rArr);
		System.out.println(myArr);
		System.out.println("숫자 야구 게임 시작!");
		
		for(int i=0; i<rArr.length; i++) {
			rArr[i] = (int)(Math.random() * 9)+1;
			for(int j=0; j<i; j++) {
				if(rArr[i] == rArr[j]){
					i--; // 랜덤 중복 제거
				}
			}
			while(true) {
				for(int j=0; j<LEN; j++) {
					int num = sc.nextInt();
					System.out.printf("값 : %d\n" , num);
					myArr[i] = num;
				} 
				if (rArr[0] == myArr[0]) {
					strike++;
				} else if(rArr[1] == myArr[1]) {
					strike++;
				} else if(rArr[2] == myArr[2]) {
					strike++;
				} else if(myArr[3] == LEN) {
					break;
				}
			}
		}
	}
}
