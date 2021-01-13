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
		System.out.println("숫자 야구 게임 시작!");
		
		for(int i=0; i<rArr.length; i++) { // 랜덤 중복 제거
			rArr[i] = (int)(Math.random() * 9)+1;
			for(int j=0; j<i; j++) {
				if(rArr[i] == rArr[j]){
					i--; 
					break;
				}
			}
		}
		for(int i=0; i<LEN; i++) {
			System.out.println(rArr[i]);
		}
		while(true) { // 오류 입력 경고메세지 출력
			int strike=0;
			int ball=0;
			for(int i=0; i<LEN; i++) {
				System.out.printf("값%d :\n ",i+1);
				myArr[i] = sc.nextInt();
				if(myArr[i]<=0 || 9<myArr[i] ) {
					System.out.println("범위 밖 숫자를 입력 하셨습니다.");
					i--;
					continue;
				}
				for(int j=0; j<i; j++) {
					if(myArr[j] == myArr[i]) {
						System.out.println("중복된 숫자를 입력 하셨습니다.");
						i--;
						continue;
					}
				}
			}
			
			for(int i=0; i<LEN; i++) { // 랜덤숫자와 사용자 숫자를 비교
				if(myArr[i] == rArr[i]) {
					strike++;
					continue;
				}
				for(int j=0; j<LEN; j++) {
					if(myArr[i] == rArr[j]) {
						ball++;
					}
				}
			}
			System.out.printf("S : %d B : %d O : %d\n",strike,ball,LEN-strike-ball);
			if(strike==LEN) {
				break;
			}
		}
		System.out.println("END!");
	}
}
