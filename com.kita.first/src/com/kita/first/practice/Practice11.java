package com.kita.first.practice;

public class Practice11 {
	public static void main(String[] args) {
		int dan = 4;
		for(int i=1; i<5; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf(i+"*"+j+"="+(i*j)+"\n--------------------\n" );
				System.out.printf("%d * %d = %d\n",i,j,(i*j));
			}
		}
	}
}
