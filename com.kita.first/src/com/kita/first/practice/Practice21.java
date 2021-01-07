package com.kita.first.practice;

import java.util.Scanner;

public class Practice21 {
	public static void main(String[] args) {
		// 컴퓨터가 뽑은 랜덤 수 (10~90)
		// Up&Down
		// 사용자가 숫자를 맞췄을 경우 Great!
		/*
		 * int max = 90; int min = 10; int rand = (int)(Math.random() *
		 * (max-min+1))+min;
		 */
		int rand = (int)(Math.random() * 81)+10; // 0 <= num * 10 < 10 // 0 ~ 9
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			if(num<0 || num>100) {
				System.out.println("잘못 입력하셨습니다.");
			} else if(num<rand) {
				System.out.println("Up");
			} else if(num>rand) {
				System.out.println("Down");
			} else {
				System.out.println("Great!");
				break;
			}
		}
	}
}
