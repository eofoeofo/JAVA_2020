package com.kita.first.practice;

public class Practice17 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println(); 
		
		int star = 4;
		int line = 1;
		int st 	 = 0;
		
		for(int i=1; i<=star*star; i++) {
			System.out.print("*");
			st++;
			
			if(st==line) {
			System.out.println();
			line++;
			st = 0;
			}
			if(line > star) {
				break;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=1; i<=star; i++) {
			for(int j=star; j>0; j--) {
				System.out.print(i<j ? "" : "*");
				/*
				 * if(i<j) { System.out.print(""); } else { System.out.print("*"); }
				 */
			}
			System.out.println();
		}
	}
}
