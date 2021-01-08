package com.kita.first.practice;

public class Practice24 {
	public static void main(String[] args) {
		int[] arr = {34 , 67 , 2 , 11 , 6 , 90};
		int temp;
		int min = 0;
		// 선택 정렬
		
		for(int i=0; i<arr.length-1; i++) {
			min = i;
		for(int j=i+1; j<arr.length; j++) {
			if(arr[min]>arr[j]) {
				min = arr[i];
			}
		}
		}
}
}
