package com.kita.first;

public class NamedLoop {
	public static void main(String[] args) {
		Parent:
		for(int i=0; i<5; i++) {
			Child:
			for(int j=0; j<3; j++) {
				if(j==1) {
					//break;
					//continue Parent;
					break Parent;
				}
				System.out.printf("%d , %d\n", i , j);
			}
		}
	}
}
