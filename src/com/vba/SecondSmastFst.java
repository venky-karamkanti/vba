package com.vba;

import java.util.Arrays;

public class SecondSmastFst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2891,4,7,6,88,32,8,2};
		Arrays.sort(arr);
		System.out.println("Second smallest element: " + arr[1] + '\n' +" First largest element : " + arr[arr.length-1]);
		System.out.println("sum of 2nd smallest and Firrst largest:  " + (arr[1]+arr[arr.length-1]));
		

	}

}
