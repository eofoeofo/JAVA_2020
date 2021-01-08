package com.kita.first.practice;

public class Practice23 {
	public static void main(String[] args) {
		int[] arr = {34 , 67 , 2 , 11 , 6 , 90};
		int temp;
		// 순차정렬
		for(int i=0; i<arr.length-1; i++) { // {0,1,2,3,4}
			  for(int j=i+1; j<arr.length; j++) { // {1,2,3,4,5}
				  if(arr[i]>arr[j]) {
					  temp = arr[i];
					  arr[i] = arr[j];
					  arr[j] = temp;
						/* System.out.println(temp); */
				  }
			  } 
		  }
		  for(int num : arr) {
			  System.out.print(num+" , ");
		  }
		  System.out.println();
	}
}
