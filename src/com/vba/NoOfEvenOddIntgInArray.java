package com.vba;

public class NoOfEvenOddIntgInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int count =0;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				
				System.out.print(  " " +arr[i]);
				
				count ++;
				sum=sum+arr[i];
						}}
				System.out.println('\n' + "sum of even integers are:  " + sum);
		System.out.println('\n' + "Number of even integers are : " +count);

}}