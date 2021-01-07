package com.kita.first;

public class Array1 {
	public static void main(String[] args) {
		int[] arr1 = new int[4];
		arr1[0] = 1;
		arr1[1] = 4;
		arr1[2] = 5;
		arr1[3] = 2; // 방법 1
		int[] arr2 = {1 , 4 , 5 , 2}; // 방법 2
		
		int[] arr5;
		arr5 = new int[] {1,2,3}; // arr5끼리 서로 주소 값이 다름 (변수 명과 값이 같더라도 new로 새로 선언을 했기 때문에 주소 값이 다르다.)
		
		/* System.out.println(arr1[1]); */
		
		boolean[] arr3 = new boolean[1];
		
		String[] arr4 = new String[3];
		
		int[] arr6 = new int[5];
		
		for(int i=0; i<arr6.length; i++) {
			arr6[i] = i+1;
		}
		System.out.println();
		System.out.println();
		for(int i=0; i<arr6.length; i++) {
			System.out.print(arr6[i] + " ");
		}
	}
}
