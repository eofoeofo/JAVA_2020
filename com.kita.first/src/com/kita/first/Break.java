package com.kita.first;

public class Break {
	public static void main(String[] args) {
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				for(int x=0; x<3; x++) {
					System.out.printf("%d, %d, %d\n",i,j,x);
					if(j==1) {
						break;
					}
				}
			}
		}
	}
}
