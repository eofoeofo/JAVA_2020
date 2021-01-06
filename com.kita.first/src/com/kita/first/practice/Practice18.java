package com.kita.first.practice;

public class Practice18 {
	public static void main(String[] args) {
		int dan = 4;
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, (dan*i));
		}
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");
		int i=1;
		while(i<10) {
			System.out.printf("%d * %d = %d\n", dan, i, (dan*i));
			i++;
		}
	}
}
