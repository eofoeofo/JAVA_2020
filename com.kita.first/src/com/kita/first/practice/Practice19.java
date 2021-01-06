package com.kita.first.practice;

import java.util.Scanner;

public class Practice19 {
	// 2021-01-06 숙제
	// while 문에 조건식을 사용하여
	// 1~100을 모두 더한 값이 출력되도록 하세요
	// 합계: 5050
	public static void main(String[] args) {
		// 합 계산기 만들기
		// 숫자를 입력하세요(0 입력 시 종료) : 1
		// 숫자를 입력하세요(0 입력 시 종료) : 3
		// 숫자를 입력하세요(0 입력 시 종료) : 7
		// 숫자를 입력하세요(0 입력 시 종료) : 2
		// 숫자를 입력하세요(0 입력 시 종료) : 0
		// 합계 : 13
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			int num = sc.nextInt();
			System.out.printf("숫자를 입력하세요 (0 입력시 종료) : %d\n" , num);
			sum += num;
			if (num == 0) {
				break;
			}
		}
		System.out.printf("합계 : %d", sum);
	}
}
