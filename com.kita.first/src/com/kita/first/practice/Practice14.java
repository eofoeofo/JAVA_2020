package com.kita.first.practice;

public class Practice14 {
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			System.out.println();
			for(int j=2; j<10; j++) {
				System.out.printf("%d * %d = %2d\t ",j,i,(j*i));
			}
		}
	}
}
