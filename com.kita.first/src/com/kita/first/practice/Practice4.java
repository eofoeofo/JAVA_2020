package com.kita.first.practice;

import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		String msg = "짝수 입니다.";
		
		if(num % 2 == 1)
		{
			msg = "홀수 입니다.";
		}
		System.out.printf(msg);
		sc.close();
	}
}
