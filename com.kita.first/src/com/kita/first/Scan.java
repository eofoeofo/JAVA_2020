package com.kita.first;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("정수 입력 : ");
		int num = scan.nextInt();
		
		String str = scan.next();
		System.out.println(str);
	}

}
