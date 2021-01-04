package com.kita.first;

public class Continue {
	public static void main(String[] args) {
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				for(int x=0; x<3; x++) {
					if(x==1) {
						continue;
					}
					System.out.printf("%d, %d, %d\n",i,j,x);
				}
			}
		}
		System.out.println("--------------------------------------------");
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				for(int x=0; x<3; x++) {
					if(x==1) {
						break;
					}
					System.out.printf("%d, %d, %d\n",i,j,x);
				}
			}
		}
	}
}
