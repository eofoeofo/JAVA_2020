package com.kita.first;

public class For2 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				for(int x=0; x<3; x++) {
					System.out.printf("%d, %d, %d\n",i,j,x);
				}
			}
		}
	}
}
