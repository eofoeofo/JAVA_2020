package com.kita.first;

public class Array2 {
	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		int[][] arr2 = {
				{1,2},
				{1,2,3,4},
				{1,2,4}
		};
		arr[0][0] = 1;
		arr[0][1] = 2;
		
		int[][] arr3 = new int[3][2];
		// { {1,2}, {1,2}, {1,2} }
		
		
		
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				arr3[i][j] = j+1;
			}
		}
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				System.out.println(arr3[i][j]);
			}
			System.out.println();
			
		}
		
		System.out.println(arr2.length);
		System.out.println();
		System.out.println(arr2[0].length);
		System.out.println(arr2[1].length);
	}
}
